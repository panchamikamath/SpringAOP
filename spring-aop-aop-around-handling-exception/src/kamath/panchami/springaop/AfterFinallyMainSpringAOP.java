package kamath.panchami.springaop;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kamath.panchami.springaop.dao.AccountDAO;

public class AfterFinallyMainSpringAOP {

	public static void main(String[] args) {

		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		//call method to find accounts
		List<Account> theAccounts = null;
		try {
			boolean tripWire = true;
			theAccounts = theAccountDAO.findAccounts(false);
		}
		catch(Exception e) {
			System.out.println("\n\nMain Program : Caught exception"+e);
		}
		
		//display accounts
		System.out.println("\n\nMain Program : AfterThrowingMinSpringApp");
		
		System.out.println(theAccounts);
		
		//close the context
		context.close();

	}

}
