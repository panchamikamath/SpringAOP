package kamath.panchami.springaop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import kamath.panchami.springaop.Account;

@Component
public class AccountDAO {
	
	private String name;
	private String serverCode;
	
	
	
	public String getName() {
		System.out.println(getClass() + "get name "+name);
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + "set name " + name);
		this.name = name;
	}

	public String getServerCode() {
		System.out.println(getClass() + "get serverCode "+name);
		return serverCode;
	}

	public void setServerCode(String serverCode) {
		System.out.println(getClass() + "set serverCode " + name);
		this.serverCode = serverCode;
	}

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
	
	public List<Account> findAccounts() {
		
		List<Account> myAccounts = new ArrayList<>();
		Account account1 = new Account("John","Silver");
		Account account2 = new Account("Mark","Gold");
		myAccounts.add(account1);
		myAccounts.add(account2);
		return myAccounts;
	}

}
