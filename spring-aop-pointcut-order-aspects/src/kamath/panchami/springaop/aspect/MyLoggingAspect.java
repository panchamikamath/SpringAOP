package kamath.panchami.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import kamath.panchami.springaop.Account;

@Aspect
@Component
@Order(2)
public class MyLoggingAspect {
	
	@Before("kamath.panchami.springaop.aspect.AopExpressions.forDaoPackageExceptSetterAndGetter()")
	public void beforeAdvice(JoinPoint theJoinPoint) {
		System.out.println("\n===> All methods except getter and setter");
		
		//display method signature
		MethodSignature methSig = (MethodSignature) theJoinPoint.getSignature();
		
		System.out.println("Method: " + methSig);
		
		//display method args
		
		//get args
		Object[] args = theJoinPoint.getArgs();
		
		for(Object tempArg : args) {
			System.out.println(tempArg);
			
			if(tempArg instanceof Account) {
				
				Account theAccount = (Account) tempArg;
				System.out.println("account name : " + theAccount.getName());
				System.out.println("account level : " + theAccount.getLevel());
			}
		}
		
	}
	
}
