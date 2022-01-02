package kamath.panchami.springaop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void addAccount() {
			
			System.out.println(getClass() + "Doing my DB work : Adding an account");
			
	}
	
	public void goToSleep() {
		System.out.println(getClass() +"go to sleep");
	}
}
