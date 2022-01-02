package kamath.panchami.springaop.dao;

import org.springframework.stereotype.Component;

import kamath.panchami.springaop.Account;

@Component
public class AccountDAO {
	
	public void addAccount(Account theAccount, boolean flag) {
		
		System.out.println(getClass() + "Doing my DB work : Adding an account");
		
	}
	
	public void updateAccount() {
			
			System.out.println(getClass() + "Doing my DB work : Updating an account");
			
	}
	
	public boolean addSillyAccount() {
		
		System.out.println(getClass() + "Doing my DB work : Adding an Silly account");
		return true;
	}

}
