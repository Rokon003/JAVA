import java.lang.*;
import java.util.*;
import classes.*;
import fileio.*;

public class Start
{
	public static void main(String args[])
	{
		Bank bank = new Bank();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		Scanner sc = new Scanner(System.in); 	// sc is an object of Scanner class and is required for taking user input.
												// nextInt() -> method to take an integer as input.
												// nextDouble() -> method to take a double as input.
												// next() -> method to take a String as input.
												// next().charAt(0) -> method to take a char as iput.
		
		boolean repeat  = true;
		
		System.out.println("************************");
		System.out.println("Welcome to XYZ Bank");
		System.out.println("************************");
		System.out.println();
		
		while(repeat)
		{
			System.out.println("What do you want to chose?\n");
			System.out.println("1. Employee Management");
			System.out.println("2. Customer Management");
			System.out.println("3. Customer Account Management");
			System.out.println("4. Account Transactions");
			System.out.println("5. Exit");
			System.out.println();
			
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				
					System.out.println("***********************************");
					System.out.println("Your Choice is: Employee Management");
					System.out.println("***********************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Insert New Employee");
					System.out.println("2. Search an Employee");
					System.out.println("3. Remove Existing Employee");
					System.out.println("4. Show All Employees");
					System.out.println("5. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Insert New Employee");
							System.out.println("***********************************");
							System.out.println();
							
							break;
						
						case 2:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Search an Employee");
							System.out.println("***********************************");
							System.out.println();
							
							break;
						
						case 3:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Remove an Existing Employee");
							System.out.println("***********************************");
							System.out.println();
							
							break;
						
						case 4:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Show All Employees");
							System.out.println("***********************************");
							System.out.println();
							
							break;
						
						case 5:
						
							System.out.println("***********************************");
							System.out.println("Your Option is to Go Back..............");
							System.out.println("***********************************");
							System.out.println();
							
							break;
						
						default: 
							
							System.out.println("***********************************");
							System.out.println("Your Choice is Invalid");
							System.out.println("***********************************");
							System.out.println();
							break;
					}
					
					System.out.println();
					break;
					
				case 2:
				
					System.out.println("***********************************");
					System.out.println("Your Choice is: Customer Management");
					System.out.println("***********************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Insert New Customer");
					System.out.println("2. Search a Customer");
					System.out.println("3. Remove Existing Customer");
					System.out.println("4. Show All Customers");
					System.out.println("5. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Insert New Customer");
							System.out.println("***********************************");
							System.out.println();
							
							break;
						
						case 2:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Search a Customer");
							System.out.println("***********************************");
							System.out.println();
							
							break;
						
						case 3:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Remove an Existing Customer");
							System.out.println("***********************************");
							System.out.println();
							
							break;
						
						case 4:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Show All Customers");
							System.out.println("***********************************");
							System.out.println();
							
							break;
						
						case 5:
						
							System.out.println("***********************************");
							System.out.println("Your Option is to Go Back..............");
							System.out.println("***********************************");
							System.out.println();
							
							break;
						
						default: 
							
							System.out.println("***********************************");
							System.out.println("Your Choice is Invalid");
							System.out.println("***********************************");
							System.out.println();
							break;
					}
					
					System.out.println();
					break;
					
				case 3:
				
					System.out.println("***********************************");
					System.out.println("Your Choice is: Customer Account Management");
					System.out.println("***********************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Insert New Account for a Customer");
					System.out.println("2. Search an Account for a Customer");
					System.out.println("3. Remove Existing Account of a Customer");
					System.out.println("4. Show All Accounts of a Customer");
					System.out.println("5. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						case 1:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Insert New Account for a Customer");
							System.out.println("***********************************");
							System.out.println();
							
							break;
						
						case 2:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Search an Account for a Customer");
							System.out.println("***********************************");
							System.out.println();
							
							break;
						
						case 3:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Remove an Existing Account of a Customer");
							System.out.println("***********************************");
							System.out.println();
							
							break;
						
						case 4:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Show All Accounts of a Customer");
							System.out.println("***********************************");
							System.out.println();
							
							break;
						
						case 5:
						
							System.out.println("***********************************");
							System.out.println("Your Option is to Go Back..............");
							System.out.println("***********************************");
							System.out.println();
							
							break;
						
						default: 
							
							System.out.println("***********************************");
							System.out.println("Your Choice is Invalid");
							System.out.println("***********************************");
							System.out.println();
							break;
					}
					
					
					System.out.println();
					break;
					
				case 4:
				
					System.out.println("***********************************");
					System.out.println("Your Choice is: Account Transactions");
					System.out.println("***********************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Deposit Money");
					System.out.println("2. Withdraw Money");
					System.out.println("3. Show All Transactions");
					System.out.println("4. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Deposit Money");
							System.out.println("***********************************");
							System.out.println();
							
							break;
						
						case 2:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Withdraw Money");
							System.out.println("***********************************");
							System.out.println();
							
							break;
						
						case 3:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Show All Transactions");
							System.out.println("***********************************");
							System.out.println();
							
							break;
					
						
						case 4:
						
							System.out.println("***********************************");
							System.out.println("Your Option is to Go Back..............");
							System.out.println("***********************************");
							System.out.println();
							
							break;
						
						default: 
							
							System.out.println("***********************************");
							System.out.println("Your Choice is Invalid");
							System.out.println("***********************************");
							System.out.println();
							break;
					}
					
					
					System.out.println();
					break;
				
				case 5:
				
					repeat = false;
					System.out.println("***********************************");
					System.out.println("Thank you for using our system");
					System.out.println("***********************************");
					
					System.out.println();
					break;
					
				default:
				
					System.out.println("***********************************");
					System.out.println("Your Choice is Invalid");
					System.out.println("***********************************");
					System.out.println();
					break;			
			}	
		}
	}
}