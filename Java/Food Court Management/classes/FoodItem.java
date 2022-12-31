package classes;

import java.lang.*;
import interfaces.*;

public abstract class FoodItem implements IQuantity
{
	protected String fid;
    protected String name;
    public int availableQuantity;
    protected double price;
	
    public FoodItem(){}
	
    public FoodItem(String fid,String name,int availableQuantity,double price)
	{
		this.fid=fid;
		this.name=name;
		this.availableQuantity=availableQuantity;
		this.price=price;
	}

    public static void setFid(String fid){this.fid=fid;}
	
    public static void setName(String name){this.name=name;}
    
	public static void setAvailableQuantity(int quantity){this.availableQuantity=quantity;}
    
	public static void setPrice(double price) {this.price=price;}
	
    public String getFid( ){return fid;}
    
	public String getName( ){return name;}
    
	public int getAvailableQuantity( ){return availableQuantity;}
	
    public double getPrice( ) {return price;}
	
	public boolean addQuantity(int amount)
	{
		if(amount>0 && amount<=availableQuantity)
		{
			availableQuantity = availableQuantity + amount;
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean sellQuantity(int amount)
	{
		if(amount>0 && amount<=availableQuantity)
		{
			availableQuantity = availableQuantity - amount;
			return true;
		}
		else
		{
			return false;
		}
	}
	
   public abstract void showInfo();
}