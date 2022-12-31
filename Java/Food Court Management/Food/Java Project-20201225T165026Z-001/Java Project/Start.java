import java.lang.*;
import java.util.*;
import classes.*;
import fileio.*;

public class Start
{
	public static void main(String args[])
	{
		FoodCourt foodCourt = new FoodCourt();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		Scanner sc = new Scanner(System.in); 	// sc is an object of Scanner class and is required for taking user input.
												// nextInt() -> method to take an integer as input.
												// nextDouble() -> method to take a double as input.
												// next() -> method to take a String as input.
												// next().charAt(0) -> method to take a char as iput.
		
		boolean repeat  = true;
		MainDish.availableQuantity = 20;
		Appetiziers.availableQuantity = 30;
		
		System.out.println("************************");
		System.out.println("Welcome to the FoodCourt");
		System.out.println("************************");
		System.out.println();
		while(repeat)
		{
			System.out.println("What do you want to chose?\n");
			System.out.println("1. Employee Management");
			System.out.println("2. Restaurant Management");
			System.out.println("3. Restaurant Fooditem Management");
			System.out.println("4. Food Quantity");
			System.out.println("5. Exit");
			System.out.println();
			
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
		}
	}
}