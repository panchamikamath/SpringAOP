package kamath.panchami.springaop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kamath.panchami.springaop.dao.AccountDAO;
import kamath.panchami.springaop.dao.MembershipDAO;

public class MainSpringAOP {

	public static void main(String[] args) {

		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		
		Account theAccount = new Account();
		//call the business method
		theAccountDAO.addAccount(theAccount,true);
		theMembershipDAO.addAccount();
		
		//check for update
		theAccountDAO.updateAccount();
		theAccountDAO.addSillyAccount();
		theMembershipDAO.goToSleep();
		
		theAccountDAO.setName("Account1");
		theAccountDAO.setServerCode("S1001");
		
		theAccountDAO.getName();
		theAccountDAO.getServerCode();
		
		//call it again
		//System.out.println("\nwhat happens when it is called again?");
		//theAccountDAO.addAccount(theAccount,true);
		
		//close the context
		context.close();

	}

}
