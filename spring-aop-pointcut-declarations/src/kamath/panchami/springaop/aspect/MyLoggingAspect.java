package kamath.panchami.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {

	//this is where we add all related advices for logging
	
	//starting with @Before advice
	/*@Before("execution(public void kamath.panchami.springaop.dao.AccountDAO.addAccount())")
	public void beforeAddAccountAdvice() {
		System.out.println("\n======>>> Executing @Before advice on addAccount()");
	}*/
	
	
	@Pointcut("execution(* kamath.panchami.springaop.dao.*.*(..))")
	public void forDaoPackage() {}
	
	@Pointcut("execution(* kamath.panchami.springaop.dao.*.get*(..))")
	public void forGetter() {}
	
	@Pointcut("execution(* kamath.panchami.springaop.dao.*.set*(..))")
	public void forSetter() {}
	
	@Pointcut("forDaoPackage() && !(forGetter() || forSetter())")
	public void forDaoPackageExceptSetterAndGetter() {}
	
	//@Before("execution(public void add*())")
	//@Before("execution(void add*())")
	
	//@Before("execution(* add*(kamath.panchami.springaop.Account))")
	//@Before("execution(* add*(*))")
	//@Before("execution(* add*(..))")
	//@Before("execution(* add*(kamath.panchami.springaop.Account,..))")
	/*@Before("forDaoPackage()")
	public void beforeAccountAdvice() {
		System.out.println("\n======>>> Executing @Before advice on method");
	}
	
	@Before("forDaoPackage()")
	public void beforeAdvice() {
		System.out.println("\n======>>> Performing analytics");
	}*/
	
	@Before("forDaoPackageExceptSetterAndGetter()")
	public void beforeAdvice() {
		System.out.println("\n===> All methods except getter and setter");
	}
}
