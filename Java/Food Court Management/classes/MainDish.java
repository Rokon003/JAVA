package classes;

import java.lang.*;

public class MainDish extends FoodItem
{
	private String category;
	
	public MainDish()
    {super();}
	
	public MainDish(String fid,String name,int availableQuantity,double price,String category)
	{
     super(fid, name, availableQuantity, price);		
	 this.category=category;
	}
	public void setCategory(String category){this.category=category;}
    public String getCategory( ){return category;}
	
	public void showDetails()
	{
		System.out.println("Food Id: "+ fid);
		System.out.println("Food Name: "+ name);
		System.out.println("price: "+ price);
		System.out.println("AvailableQuantity "+ availableQuantity);
		System.out.println("Category: "+ category);
	}
}
	
	
	