import java.lang.*;

public class FixedAccount(){
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	private int tenureYear;
	private static double perTransactionLimit;
	
	FixedAccount(){
		
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
	void setTenureYear(int tenureYear){
		this.tenureYear=tenureYear;
	}
	String getAccountNumber( ){
		return accountNumber;
	}
	String getAccountHolderName( ){
		return accountHolderName;
	}
	double getBalance( ){
		return balance;
		
	}
	int getTenureYear( ){
		return tenureYear;
	}
	void depositMoney(double amount){
		if (amount>0 && amount<=perTransactionLimit){
			balance+=amount;
		}
		else{
			System.out.println("Error");
		}
	}
	void withdrawMoney(double amount){
		if (amount>0 && amount<=balance && amount<=perTransactionLimit){
			balance-=amount;
		}
		else{
			System.out.println("Insufficient amount")
		}
		
	}
}
