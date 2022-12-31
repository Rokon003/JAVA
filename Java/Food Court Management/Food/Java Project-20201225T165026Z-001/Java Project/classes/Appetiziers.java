package classes;

import java.lang.*;

public class Appetiziers extends FoodItem
{
	private String size;
	
	public Appetiziers()
	{}
	public Appetiziers(String fid,String name,int availableQuantity,double price,String size)
	{
     super(fid, name, availableQuantity, price);		
	 this.size=size;
	}
	
	public void setSize(String size) {this.size=size;}
    
	public String getSize() {return size;}
	
	public void showDetails()
	{
		System.out.println("Food Id: "+ fid);
		System.out.println("Food Name: "+ name);
		System.out.println("price: "+ price);
		System.out.println("AvailableQuantity "+ availableQuantity);
		System.out.println("Size: "+ size);
	}
}