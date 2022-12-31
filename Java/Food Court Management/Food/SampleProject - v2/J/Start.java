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
		SavingsAccount.perTransactionLimit = 50000.0;
		FixedAccount.perTransactionLimit = 1000000.0;
		
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
							
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Employee Salary:");
							double salary1 = sc.nextDouble();
							
							Employee e1  = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							if(bank.insertEmployee(e1)){System.out.println("Employee Inserted.... ID: "+e1.getEmpId());}
							else{System.out.println("Oops..... Something is Wrong");}
							
							System.out.println();
							
							
							break;
						
						case 2:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Search an Employee");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.print("Enter Employee ID: ");
							String empId2 = sc.next();
							
							Employee e2 = bank.searchEmployee(empId2);
							
							if(e2 != null)
							{
								System.out.println("Employee Found..............");
								System.out.println("Employee ID: "+e2.getEmpId());
								System.out.println("Employee Name: "+e2.getName());
								System.out.println("Employee Salary: "+e2.getSalary());
								System.out.println();
							}
							else{System.out.println("No Such Employee Found......");}
							
							System.out.println();
							
							break;
						
						case 3:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Remove an Existing Employee");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.print("Enter Employee ID: ");
							String empId3 = sc.next();
							
							Employee e3 = bank.searchEmployee(empId3);
							
							if(e3 != null)
							{
								if(bank.removeEmployee(e3)){System.out.println("Employee Removed........ ID: "+e3.getEmpId());}
								else{System.out.println("Oops..... Something is Wrong....");}
							}
							else{System.out.println("No Such Employee Found to remove......");}
							
							System.out.println();
							break;
						
						case 4:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Show All Employees");
							System.out.println("***********************************");
							System.out.println();
							
							bank.showAllEmployees();
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
							
							System.out.print("Enter Customer NID: ");
							int nid1 = sc.nextInt();
							System.out.print("Enter Customer Age: ");
							int age1 = sc.nextInt();
							System.out.print("Enter Customer Mobile Number: ");
							String mobileNumber1 = sc.next();
							
							Customer c1 = new Customer();
							c1.setNid(nid1);
							c1.setAge(age1);
							c1.setMobileNumber(mobileNumber1);
							
							if(bank.insertCustomer(c1)){System.out.println("Customer Inserted..... NID: "+ c1.getNid());}
							else{System.out.println("Oops..... Something is Wrong...");}
							
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
							
							bank.showAllCustomers();
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
							
							System.out.println("There are two types of Account: ");
							System.out.println("1. Savings Account");
							System.out.println("2. Fixed Account");
							System.out.println("3. Go Back");
							
							System.out.print("Enter your Type: ");
							int type = sc.nextInt();
							
							Account a = null; 
							
							if(type == 1)
							{
								System.out.println("Your Type is: Savings Account");
								
								System.out.print("Enter Account Number: ");
								String an = sc.next();
								System.out.print("Enter Account Holder Name: ");
								String ahn = sc.next();
								System.out.print("Enter Account Balance: ");
								double b = sc.nextDouble();
								System.out.print("Enter Account Interest Rate: ");
								double ir = sc.nextDouble();
								
								SavingsAccount sa = new SavingsAccount(an, ahn, b, ir);
								
								a = sa;
									
							}
							else if(type == 2)
							{
								System.out.println("Your Type is: Fixed Account");
								
								System.out.print("Enter Account Number: ");
								String an = sc.next();
								System.out.print("Enter Account Holder Name: ");
								String ahn = sc.next();
								System.out.print("Enter Account Balance: ");
								double b = sc.nextDouble();
								System.out.print("Enter Account Tenure Year: ");
								int ty = sc.nextInt();
								
								FixedAccount fa = new FixedAccount(an, ahn, b, ty);
								
								a = fa;
								
							}
							else if(type == 3)
							{
								System.out.println("Going Back.................");
							}
							else
							{
								System.out.println("Invalid Type......");
							}
							
							if(a != null)
							{
								System.out.print("Enter Customer NID: ");
								int nid = sc.nextInt();
								
								Customer c = bank.searchCustomer(nid);
								
								if(c != null)
								{
									if(c.insertAccount(a)){System.out.println("Account Inserted.... Account Number: "+a.getAccountNumber());}
									else{System.out.println("Account Not inserted");}
								}
								else{System.out.println("Oops... Something is Wrong.....");}
							}
							
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
							
							System.out.print("Enter Customer NID: ");
							int nid4 = sc.nextInt();
								
							Customer c4 = bank.searchCustomer(nid4);
							
							if(c4 != null){c4.showAllAccounts();}
							else{System.out.println("Oops.... Something is Worng....");}
							
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
							
							System.out.print("Enter Customer NID: ");
							int nid1 = sc.nextInt();
							
							Customer c1 = bank.searchCustomer(nid1);
							
							if(c1 != null)
							{
								System.out.print("Enter Account Number: ");
								String an = sc.next();
								
								Account acc = c1.searchAccount(an);
								
								if(acc != null)
								{
									System.out.println("Current Balance: "+acc.getBalance());
									System.out.print("Enter Deposit Amount: ");
									double am = sc.nextDouble();
									
									if(acc.depositMoney(am))
									{
										System.out.println("New Balance: "+acc.getBalance());
										frwd.writeInFile(am + " Deposited in "+ acc.getAccountNumber());
									}
									else{System.out.println("Oops... Something is Worng...");}
								}
								else{System.out.println("Oops... Something is Worng...");}
							}
							else{System.out.println("Oops... Something is Worng...");}
							
							System.out.println();
							break;
						
						case 2:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Withdraw Money");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.print("Enter Customer NID: ");
							int nid2 = sc.nextInt();
							
							Customer c2 = bank.searchCustomer(nid2);
							
							if(c2 != null)
							{
								System.out.print("Enter Account Number: ");
								String an = sc.next();
								
								Account acc = c2.searchAccount(an);
								
								if(acc != null)
								{
									System.out.println("Current Balance: "+acc.getBalance());
									System.out.print("Enter Withdraw Amount: ");
									double am = sc.nextDouble();
									
									if(acc.withdrawMoney(am))
									{
										System.out.println("New Balance: "+acc.getBalance());
										frwd.writeInFile(am + " Withdrawn from "+ acc.getAccountNumber());
									}
									else{System.out.println("Oops... Something is Worng...");}
								}
								else{System.out.println("Oops... Something is Worng...");}
							}
							else{System.out.println("Oops... Something is Worng...");}
							
							System.out.println();
							
							break;
						
						case 3:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Show All Transactions");
							System.out.println("***********************************");
							System.out.println();
							
							frwd.readFromFile();
							
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