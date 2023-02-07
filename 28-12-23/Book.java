package afternoon;

public class Book {

		int bid ;
		String bTitle;
		int price;	

//constructor
  public Book()
  {
	  bid= 23;
	  bTitle= "java";
	  price=1500;
  }
  Book(int bookId,String bookTitle)
  {
	  bid= bookId;
	  bTitle= bookTitle;
  }
  
  Book(int bookId,String bookTitle, int bookPrice)
  {
	  bid= bookId;
	  bTitle= bookTitle;
	  price = bookPrice;
  }
  
 public void display(){
	  System.out.println("Boook id is" +bid);
	  System.out.println("Boook title is" +bTitle);
	  System.out.println("Boook price is" +price);
  }
  
  public class Construstor {
	    public static void main(String[] args)
	    {
	        // this would invoke default constructor.
	        Book bk1 = new Book();
	        bk1.display();
	        
	        // this would invoke perimeterized constructor with 2 param.
	        Book bk2 = new Book(30,"SQL");
	        bk2.display();
	        
	        // this would invoke perimeterized constructor with 3 param.
	        Book bk3 = new Book(15,"Python",5000);
	        bk3.display();
	        
	    }
     }
  }
