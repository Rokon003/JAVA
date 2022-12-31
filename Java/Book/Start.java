import java.lang.*;

public class Start{
	public static void main(String [] args){
		
		Book[] b = new Book[5];
		
		for(int i=0;i<5;i++){
			b[i]= new Book();
		}

		b[0].setIsbn("UPC 827714014280 00111");
		b[0].setbTitle("The Great Influenza");
		b[0].setAuthorName("John M. Barry.");
		b[0].setPrice(35);
		b[0].setAvailableQuantity(100);
		b[0].addQuantity(15);
		b[0].sellQuantity(75);

		b[1].setIsbn("UPC 074470681953 01");
		b[1].setbTitle("The Ride of a Lifetime");
		b[1].setAuthorName("Bob Iger");
		b[1].setPrice(75);
		b[1].setAvailableQuantity(500);
		b[1].addQuantity(250);
		b[1].sellQuantity(400);

		b[2].setIsbn("UPC 827714014280 00311");
		b[2].setbTitle("Growth");
		b[2].setAuthorName("Vaclav Smil");
		b[2].setPrice(40);
		b[2].setAvailableQuantity(200);
		b[2].addQuantity(50);
		b[2].sellQuantity(70);

		b[3].setIsbn("UPC 094922943705");
		b[3].setbTitle("Cloud Atlas");
		b[3].setAuthorName("David Mitchell");
		b[3].setPrice(60);
		b[3].setAvailableQuantity(400);
		b[3].addQuantity(200);
		b[3].sellQuantity(300);

		b[4].setIsbn("UPC 827714009026");
		b[4].setbTitle("Lights Out: Pride, Delusion, and the Fall of General Electric");
		b[4].setAuthorName(" Thomas Gryta");
		b[4].setPrice(50);
		b[4].setAvailableQuantity(450);
		b[4].addQuantity(150);
		b[4].sellQuantity(250);

		for(int i=0;i<5;i++){
			b[i].showDetails();
		}


	}
}