package classes;

import java.lang.*;
import interfaces.*;

public class Customer implements AccountOperations
{
	private int nid;
	private int age;
	private String mobileNumber;
	private Account listOfAccounts[];
	
	public Customer()
	{
		System.out.println("E-Customer");
		this.listOfAccounts = new Account[10];
	}
	public Customer(int nid, int age, String mobileNumber, int sizeOfArray)
	{
		System.out.println("P-Customer");
		this.nid = nid;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.listOfAccounts = new Account[sizeOfArray];
	}
	
	public void setNid(int nid){this.nid = nid;}
	public void setAge(int age){this.age = age;}
	public void setMobileNumber(String mobileNumber){this.mobileNumber = mobileNumber;}

	public int getNid(){return nid;}
	public int getAge(){return age;}
	public String getMobileNumber(){return mobileNumber;}
	
	public boolean insertAccount(Account a)
	{
		boolean flag = false;
		
		for(int i = 0; i<listOfAccounts.length; i++)
		{
			if(listOfAccounts[i] == null)
			{
				listOfAccounts[i] = a;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeAccount(Account a)
	{
		boolean flag = false;
		
		for(int i=0; i<listOfAccounts.length; i++)
		{
			if(listOfAccounts[i] == a)
			{
				listOfAccounts[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public void showAllAccounts()
	{
		System.out.println("**********************************");
		System.out.println("Customer NID: "+ nid);
		System.out.println("Customer Age: "+ age);
		System.out.println("Customer Mobile Number: "+ mobileNumber);
		
	
		for(int i=0; i<listOfAccounts.length; i++)
		{
			if(listOfAccounts[i] != null)
			{
				System.out.println("------------------------");
				listOfAccounts[i].showDetails();
				System.out.println();
			}
		}
	}
	
	public Account searchAccount(String accountNumber)
	{
		Account a = null;
		
		for(int i=0; i<listOfAccounts.length; i++)
		{
			if(listOfAccounts[i] != null)
			{
				if(listOfAccounts[i].getAccountNumber().equals(accountNumber))
				{
					a = listOfAccounts[i];
					break;
				}
			}
		}
		return a;
	}
}

