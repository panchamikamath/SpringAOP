package kamath.panchami.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyLoggingAspect {
	
	@Before("kamath.panchami.springaop.aspect.AopExpressions.forDaoPackageExceptSetterAndGetter()")
	public void beforeAdvice() {
		System.out.println("\n===> All methods except getter and setter");
	}
	
}
