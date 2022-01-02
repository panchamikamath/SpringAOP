package kamath.panchami.springaop.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import kamath.panchami.springaop.Account;

@Aspect
@Component
@Order(2)
public class MyLoggingAspect {
	
	@Before("kamath.panchami.springaop.aspect.AopExpressions.forDaoPackageExceptSetterAndGetter()")
	public void beforeAdvice() {
		System.out.println("\n===> All methods except getter and setter");
	}
	
	@AfterReturning(
			pointcut="execution(* kamath.panchami.springaop.dao.AccountDAO.findAccounts(..))",
			returning="result")
	public void afterReturningAccounts(JoinPoint theJoinPoint, List<Account> result) {
		
		if(!result.isEmpty()) {
			Account tempAccount = result.get(0);
			tempAccount.setName("Mary");
		}
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("\n==> After returning accounts: " + method);
		System.out.println("\n==> result is " + result);
		
		convertAccountNamestoUpperCase(result);
	}

	private void convertAccountNamestoUpperCase(List<Account> result) {
		if(!result.isEmpty()) {
			for(Account tempAccount:result) {
				String theUpperCaseName = tempAccount.getName().toUpperCase();
				tempAccount.setName(theUpperCaseName);
			}
		}
		
	}
	
	@AfterThrowing(
			pointcut="execution(* kamath.panchami.springaop.dao.AccountDAO.findAccounts(..))",
			throwing="thThrow")
	public void afterThrowingAccounts(JoinPoint theJoinPoint, Throwable thThrow) {
		
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("\n==> After throwing accounts: " + method);
		System.out.println("\n==> result is " + thThrow);
	}
	
}
