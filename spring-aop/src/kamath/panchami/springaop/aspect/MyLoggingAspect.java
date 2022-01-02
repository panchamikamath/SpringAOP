package kamath.panchami.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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
	
	//@Before("execution(public void add*())")
	//@Before("execution(void add*())")
	
	//@Before("execution(* add*(kamath.panchami.springaop.Account))")
	//@Before("execution(* add*(*))")
	//@Before("execution(* add*(..))")
	//@Before("execution(* add*(kamath.panchami.springaop.Account,..))")
	@Before("execution(* kamath.panchami.springaop.dao.*.*(..))")
	public void beforeAccountAdvice() {
		System.out.println("\n======>>> Executing @Before advice on method");
	}
}
