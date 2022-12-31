package classes;

import java.lang.*;
import interfaces.*;

public class Restaurant implements FoodItemOperations
{
	private String rid;
    private String name;
    private FoodItem fooditems[];
	
	public Restaurant()
	{
		this.fooditems = new FoodItem[10];
	}
	public Restaurant(String rid,String name,int sizeOfArray)
	{
		this.rid = rid;
		this.name = name;
		this.listOfFoodItem = new FoodItem[sizeOfArray];
	}
	public void setRid(String rid){this.rid = rid;}
	public void setName(String name){this.name = name;}
    public String getRid() {return rid;}  
    public String getName(){return name;}
   
   
   public boolean insertFoodItem(FoodItem f)
   
	{
		boolean flag = false;
		
		for(int i = 0; i<listOfFoodItem.length; i++)
		{
			if(listOfFoodItem[i] == null)
			{
				listOfAccounts[i] = f;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeFoodItem(FoodItem f)
	{
		boolean flag = false;
		
		for(int i=0; i<listOfFoodItem.length; i++)
		{
			if(listOfFoodItem[i] == f)
			{
				listOfFoodItem[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public void showAllFoodItems()
	{
		System.out.println("**********************************");
		System.out.println("Food RID: "+ rid);
		System.out.println("Food Name: "+ name);
		
	
		for(int i=0; i<listOfFoodItem.length; i++)
		{
			if(listOfFoodItem[i] != null)
			{
				System.out.println("------------------------");
				listOfFoodItem[i].showDetails();
				System.out.println();
			}
		}
	}
	
	public FoodItem searchFoodItem(String fid);
	{
		FoodItem a = null;
		
		for(int i=0; i<listOfFoodItem.length; i++)
		{
			if(listOfFoodItem[i] != null)
			{
				if(listOfFoodItem[i].getFid().equals(fid))
				{
					a = listOfFoodItem[i];
					break;
				}
			}
		}
		return a;
	}
}