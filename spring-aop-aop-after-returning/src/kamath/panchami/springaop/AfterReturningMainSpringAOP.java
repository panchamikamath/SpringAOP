package kamath.panchami.springaop;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kamath.panchami.springaop.dao.AccountDAO;
import kamath.panchami.springaop.dao.MembershipDAO;

public class AfterReturningMainSpringAOP {

	public static void main(String[] args) {

		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		//call method to find accounts
		List<Account> theAccounts = theAccountDAO.findAccounts();
		
		//display accounts
		System.out.println("\n\nMain Program : AfterReturningMinSpringApp");
		
		System.out.println(theAccounts);
		
		//close the context
		context.close();

	}

}
