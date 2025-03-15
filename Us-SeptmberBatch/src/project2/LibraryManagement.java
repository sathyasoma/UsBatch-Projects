package project2;

import java.util.Scanner;

public class LibraryManagement {

	int Max_Books=100;
	
	String[] bookTitles= new String[Max_Books];
	String[] bookAuthors=new String[Max_Books];
	
	int bookCount=0;
	
	Scanner sc= new Scanner(System.in);
	
	public void run()
	{
		
		while(true)
		{
			System.out.println("*******Library Management******");
			System.out.println("1.Add New Book");
			System.out.println("2.Search for a Book by Title");
			System.out.println("3. Display All Books");
			System.out.println("4.Remove a Book by Title");
			System.out.println("5.Exit");
			System.out.println("Choose a Option......");
			
			int choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
			case 1:
				System.out.println("added a book");
				addBook();
				break;
			case 2:
				System.out.println("search a book");
				searchBook();
				break;
			case 3:
				System.out.println("display a book");
				displayBooks();
				break;
			case 4:
				System.out.println("remove a book");
				removeBook();
				break;
			case 5:
				System.out.println("Exiting System.....");				
				return;
			default:
				System.out.println("Invalid option Please try again...");
			}
						
		}
	}
	
	public void addBook()
	{
		 if(bookCount==Max_Books) //100==100
		 {
			 System.out.println("Librarry is Full We cant add new book");
		 }
		 System.out.println("Enter The Book Title");
		 String title=sc.nextLine();
		 System.out.println("Enter the Book Author");
		 String author=sc.nextLine();
		 
		 bookTitles[bookCount]=title;
		 bookAuthors[bookCount]=author;
		 bookCount++;
		 System.out.println("Book is Addedd Sucusefully....");
			 
	}
	//search a book 
	
	public void searchBook() {
		
		System.out.println("Enter the Title of the Book to search");
		
		String title=sc.nextLine();
		
		for(int i=0;i<bookCount;i++)
		{
			if(bookTitles[i].equalsIgnoreCase(title))
			{
				System.out.println("Book is Found");
				System.out.println("Title :"+bookTitles[i]);
				System.out.println("Author :"+bookAuthors[i]);
				return;
			}
		}
		System.out.println("Book not found");
	}
	
	//dispaly the book
	
	public void displayBooks()
	{
	  if(bookCount==0)
	  {
		  System.out.println("No Books are in the librarys");
		  return;
	  }
	  System.out.println("Books in the Library");
	  for(int i=0;i<bookCount;i++)
	  {
		  System.out.println((i+1)+" Title: "+bookTitles[i]+", Author :"+bookAuthors[i]);
	  }
	}
	
	public void removeBook()
	{
		System.out.println("Enter the book title to Remove");
		String title=sc.nextLine();
		
		for(int i=0;i<bookCount;i++)
		{
			if(bookTitles[i].equalsIgnoreCase(title))
			{
				for(int j=i;j<bookCount-1;j++)
				{
					bookTitles[j]=bookTitles[j+1];
					bookAuthors[j]=bookAuthors[j+1];
				}
				bookCount--;
				System.out.println("Book is removed succfully ....");
				return;
			}
		}
		System.out.println("Book not found");
	}
	public static void main(String[] args) {
		
		LibraryManagement library= new LibraryManagement();
		 library.run();
		
	}
	
	
}
