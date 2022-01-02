package kamath.panchami.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopExpressions {

	@Pointcut("execution(* kamath.panchami.springaop.dao.*.*(..))")
	public void forDaoPackage() {}
	
	@Pointcut("execution(* kamath.panchami.springaop.dao.*.get*(..))")
	public void forGetter() {}
	
	@Pointcut("execution(* kamath.panchami.springaop.dao.*.set*(..))")
	public void forSetter() {}
	
	@Pointcut("forDaoPackage() && !(forGetter() || forSetter())")
	public void forDaoPackageExceptSetterAndGetter() {}
	
}
