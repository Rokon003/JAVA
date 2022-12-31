import java.lang.*;

public class SavingsAccount(){
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	double interestRate;
	static double perTransactionLimit;
	
	SavingsAccount( ){
		
	}
	static void setPerTransactionLimit(double ptl){
		perTransactionLimit=ptl;
	}
	static double getPerTransactionLimit( ){
		return perTransactionLimit;
	}
	void setAccountNumber(String accountNumber){
		this.accountNumber=accountNumber;
	}
	void setAccountHolderName(String accountHolderName){
		this.accountHolderName=accountHolderName;
	}
	void setBalance(double balance){
		this.balance=balance;
	}
	void setInterestRate(double interestRate){
		this interestRate=interestRate;
	}
	double getInterestRate( ){
		return interestRate;
	}
	
	String getAccountHolderName( ){
		return accountHolderName;
	}
	double getBalance( ){
		return balance;
	}
	void depositMoney(double amount){
		balance+=amount;
	}
	void withdrawMoney(double amount){
		balance-=amount;
	}
}