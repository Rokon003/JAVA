import java.lang.*;

public class StoryBook extends Book
{
	private String catagory;
	
	public StoryBook()
	{
		super();
	  System.out.println("Empty story book");
	}
	StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category)
	{
		super(isbn,bookTitle,authorName,price,availableQuantity);
		this.catagory=catagory;
	}
	public void setCategory(String category)
	{
		this.catagory=catagory;
	}
	public String getCategory()
	{
	    return catagory;	
	}
	public void showDetails()
	{ 
	    super.showDetails();
		System.out.println("Category"+catagory);

	}
}