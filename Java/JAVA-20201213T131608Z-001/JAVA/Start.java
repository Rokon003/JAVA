import java.lang.*;

public class Start
{
	public static void main(String [] args)
	{
		
		StoryBook sb1 = new StoryBook("UPC 827714014280 00111",
		                               "The Great Influenza",
									   "John M. Barry.",
									   10.06,20,
									   "Story Book 1");
		StoryBook sb2 = new StoryBook("UPC 074470681953 01"
		                               ,"The Ride of a Lifetime",
									   "Bob Iger",
									   10.05,10,
									   "Story Book 2");
		StoryBook sb3 = new StoryBook("UPC 094922943705",
		                              "Cloud Atlas",
									  "David Mitchell",
									  31.06,14,
									  "Story Book 3");
		StoryBook sb4 = new StoryBook("UPC 827714014280 00311",
		                              "Growth",
									  "Vaclav Smil",
									  21.06,20,
									  "Story Book 4");
		StoryBook sb5 = new StoryBook("UPC 827714009026",
		                              "Lights Out: Pride, Delusion, and the Fall of General Electric",
									  "Thomas Gryta",
									  51.18,61,
									  "Story Book 5");

		TextBook tb1 = new TextBook("12121212121212",
		                            "God of War 4",
									"SIE Santa Monica Studio",
									39.9,20,
									1);
		TextBook tb2 = new TextBook("23232323232323",
		                            "Ghost of Tsushima",
									"Sucker Punch Productions",
									29.9,35,
									2);
		TextBook tb3 = new TextBook("24242424242424",
		                            "DMC 5",
									"Capcorn",
									19.9,70,
									3);
		TextBook tb4 = new TextBook("252525255255252",
		                            "Sekiro",
									"From Softwere",
									59.9,55,
									4);
		TextBook tb5 = new TextBook("262626262626262",
		                            "Cyberpunk2077",
									"CD Project Red",
									29.99,10,
									5);

		BookShop bookShop = new BookShop("Book Shop");

		if(bookShop.insertBook(sb1))
		{System.out.println("Inserted\n");}
		else{System.out.println("Not Done");}

		if(bookShop.insertBook(sb2))
		{System.out.println("Inserted\n");}
		else{System.out.println("Not Done");}

		if(bookShop.insertBook(sb3))
		{System.out.println("Inserted\n");}
		else{System.out.println("Not Done");}

		if(bookShop.insertBook(sb4))
		{System.out.println("Inserted\n");}
		else{System.out.println("Not Inserted\n");}

		if(bookShop.insertBook(sb5))
		{System.out.println("Inserted\n");}
		else{System.out.println("Not Inserted\n");}

		if(bookShop.insertBook(tb1))
		{System.out.println("Inserted\n");}
		else{System.out.println("Not Inserted\n");}

		if(bookShop.insertBook(tb2))
		{System.out.println("Inserted\n");}
		else{System.out.println("Not Inserted\n");}

		if(bookShop.insertBook(tb3))
		{System.out.println("Inserted\n");}
		else{System.out.println("Not Inserted\n");}

		if(bookShop.insertBook(tb4))
		{System.out.println("Inserted\n");}
		else{System.out.println("Not Inserted\n");}

		if(bookShop.insertBook(tb5))
		{System.out.println("Inserted\n");}
		else{System.out.println("Not Inserted\n");}

		bookShop.showAllBooks();

		Book forSearch = new Book();
		forSearch=bookShop.searchBook("12121212121");
		if(forSearch!=null){System.out.println("found");forSearch.showDetails();}
		else{System.out.println("not found or not inserted");}
	}
}