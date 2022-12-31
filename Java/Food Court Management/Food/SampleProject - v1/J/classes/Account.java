package classes;

import java.lang.*;
import interfaces.*;

public abstract class Account implements ITransactions
{
	protected String accountNumber;
	protected String accountHolderName;
	protected double balance;
	public static double perTransactionLimit;
	
	public Account()
	{
		System.out.println("E-A");
	}
	public Account(String accountNumber, String accountHolderName, double balance)
	{
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		System.out.println("P-A");
	}
	
	public static void setPerTransactionLimit(double ptl)
	{
		perTransactionLimit = ptl;
	}
	public static double getPerTransactionLimit(){return perTransactionLimit;}
	
	public void setAccountNumber(String accountNumber){this.accountNumber = accountNumber;}
	public void setAccountHolderName(String accountHolderName){this.accountHolderName = accountHolderName;}
	public void setBalance(double balance){this.balance = balance;}
	
	public String getAccountNumber(){return accountNumber;}
	public String getAccountHolderName(){return accountHolderName;}
	public double getBalance(){return balance;}
	
	public void depositMoney(double amount)
	{
		if(amount>0 && amount<=perTransactionLimit)
		{
			System.out.println("Previous Balance: "+balance);
			System.out.println("Depositing Amount: "+amount);
			balance = balance + amount;
			System.out.println("Current Balance: "+balance);
		}
		else
		{
			System.out.println("Invalid Request");
		}
	}
	public void withdrawMoney(double amount)
	{
		if(amount>0 && amount<=perTransactionLimit && amount<=balance)
		{
			System.out.println("Previous Balance: "+balance);
			System.out.println("Withdraw Amount: "+amount);
			balance = balance - amount;
			System.out.println("Current Balance: "+balance);
		}
		else
		{
			System.out.println("Invalid Request");
		}
	}
	
	public abstract void showDetails();
}