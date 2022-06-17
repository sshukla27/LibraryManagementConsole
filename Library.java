package Library_Management;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
	private ArrayList<User> users;
	private ArrayList<Book> books;
	private ArrayList<Subscription> subscriptions;
	private ArrayList<Role> roles;
	private ArrayList<CustomerFeedback> feedbacks;
	private ArrayList<Genre> genres;
	private ArrayList<Review> reviews;
	private ArrayList<BookBorrow> booksBorrow;
	public Library() {
		users = new ArrayList<User>();
		books = new ArrayList<Book>();
		subscriptions = new ArrayList<Subscription>();
		feedbacks = new ArrayList<CustomerFeedback>();
		roles = new ArrayList<Role>();
		genres = new ArrayList<Genre>();
		reviews = new ArrayList<Review>();
		
		try {
			books.add(new Book(2,"The Secret", "Rhonda Byrne", 2010,15,"Self-help" ));
			books.add(new Book(3,"Just Listen", "Mark Goulston", 2010, 15,"Self-help" ));
			books.add(new Book(4,"The 5 love languages", "Gary Chapman", 2011, 20,"Self-help" ));
			books.add(new Book(5,"Men are Mars, women are from Venus", "John Gray", 2010,15,"Self-help" ));
			books.add(new Book(6,"Downton Abbey", "Julian Fellows", 2010,15,"Historical Drama" ));
			books.add(new Book(7,"Zindagi Gulzar Hai", "Umera Ahmed", 2010,15,"Romance" ));
			

		users.add(new User(1, "Vasant Vihar, Delhi", 7203072719l, "Rudra Trivedi", "fakkf@gmail.com", "0000"));
		users.add(new User(2, "Siddhivinayak, Mumbai", 7203072621l, "Honey Panchal", "fahhhf@gmail.com", "0000"));
		users.add(new User(3, "Sarvoday Vihar, Varanasi", 7203072945l, "Dhara Shah", "faggsdf@gmail.com", "0000"));
		users.add(new User(4, "Nandanagar, Indore", 7203072248l, "Vishal Tiwari", "fahhh@gmail.com", "0000"));
		users.add(new User(5, "Gandhinagar, Gudgaon", 7203072555l, "Niti Shukla", "fdfsf@gmail.com", "0000"));
		}catch(Exception e) {}
	}

	
//	public Library(long users, long books, long subscription, int roles, String feedbacks, int genres) {
//		super();
//		//this.users = users;
//		//Books = books;
//		this.subscription = subscription;
//		this.roles = roles;
//		this.feedbacks = feedbacks;
//		this.genres = genres;
//	}
	
	private static String getInput() {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.flush();
		try {
			return stdin.readLine();
		} catch (Exception e) {
			return "Error: " + e.getMessage();
		}
	}

	public void addBook(Scanner sc ) {
		String uInput;
		Book book = new Book();
		
		System.out.println("Fill up the details:");
		System.out.print("Book Id : ");
		book.setBookId(sc.nextLong());

		System.out.print("\nBook Name : ");
		uInput = getInput();
		book.setBookName(uInput);

		System.out.print("\nAuthor : ");
		uInput = getInput();
		book.setAuthor(uInput);

//		System.out.print("\nReview : ");
//		book.setReview(sc.nextInt());

		System.out.print("\nEdition : ");
		book.setEdition(sc.nextInt());

		System.out.print("\nQuantity : ");
		book.setQuantitiy(sc.nextInt());

		System.out.print("\nGenre : ");
		uInput = getInput();
		book.setGenre(uInput);
		books.add(book);
		System.out.print("successfully added" + "\n\n");
	}
	
	
	public void editBook(Scanner sc)
	{
		Book book=new Book();
		System.out.println("Enter the book name you want to edit:");
		String editable=sc.next();
		try {
		for(Book b:books)
		{
			if(b.getBookName().equals(editable))
			{
				String uInput=getInput();
				System.out.print("Book Id : ");
				book.setBookId(sc.nextLong());

				System.out.print("\nBook Name : ");
				uInput = getInput();
				book.setBookName(uInput);

				System.out.print("\nAuthor : ");
				uInput = getInput();
				book.setAuthor(uInput);

//				System.out.print("\nReview : ");
//				book.setReview(sc.nextInt());

				System.out.print("\nEdition : ");
				book.setEdition(sc.nextInt());

				System.out.print("\nQuantity : ");
				book.setQuantitiy(sc.nextInt());

				System.out.print("\nGenre : ");
				uInput = getInput();
				book.setGenre(uInput);
				books.add(book);
				System.out.print("successfully edited" + "\n\n");

			}
			else 
			{
				System.out.println("The book "+editable+" does not exist in Library");
			}
		}
		}catch(Exception e) {}
	}

	public void displayBooks() {

		System.out.println("Books detail:");

		for (Book b : books) {
			System.out.println(b.getBookId() + "\t" + b.getBookName() + "\t\t" + b.getAuthor() + "\t\t"
					+ b.getEdition() + "\t\t" + b.getQuantitiy() + 1 + "\t" + b.getGenre());
		}
	}

	public void displayReaders() 
	{
		System.out.println("List of Users : ");

		for (User u : users) {
			System.out.println(u.getUserId() + "\t" + u.getReaderName() + "\t\t" + u.getContactNumber() + "\t\t"
					+ u.getEmail() + "\t\t" + u.getAddress());
		}
	}
		// readers operation 
	public boolean signingUp(Scanner sc)//sign up
	{
		User r = new User();
		String rInput;
		boolean signUpStatus=false;

		try {
		
		System.out.println("User Id : ");
		r.setUserId(sc.nextInt());

		System.out.println("Reader's Name : ");
		rInput=getInput();
		r.setReaderName(rInput);

		System.out.println("Contact Number : ");
		r.setContactNumber(sc.nextLong());

		System.out.println("Email ID : ");
		rInput=getInput();
		r.setEmail(rInput);

		//System.out.println("Registration Date : ");
		// r.setRegDate(sc.next

		System.out.println("Address : ");
		rInput=getInput();
		r.setAddress(rInput);

		System.out.println("Password : ");
		rInput=getInput();
		r.setPwd(rInput);

		r.setRegDate(LocalDate.now());

		users.add(r);
		System.out.println("Suceessfully signed up! : ");

		signUpStatus=true;
		}catch(Exception e){}
		
		return signUpStatus;
		}
	
	public void search(Scanner sc)
	{
		System.out.println("Search by Book-name/ Author Name / Genre :");
		String searchOption=getInput();
		Book bk=null;
			for(Book b:books)
			{
				if(b.getBookName().equals(searchOption) || b.getAuthor().equals(searchOption)|| b.getGenre().equals(searchOption))
				{
					bk=b;
					break;
				}
			}
			
			if(bk!=null) 
			{
				System.out.println(bk.getBookId() + "\t" + bk.getBookName() + "\t\t" + bk.getAuthor() + "\t\t"
						+ bk.getEdition() + "\t\t" + bk.getQuantitiy() + 1 + "\t" + bk.getGenre());
			}
			else
			{
				System.out.println("The book not found!");
			}
		}
	
public enum LoginStatus{
		
		UserNotFound, PasswordIncorrect, Success; //List of named integer constant because their value is constant.(0,1,2) 
	}
	public LoggedInUser login(Scanner sc, String rEmail,String rPasswd) { //Reader's login
		
		//System.out.println("Enter User Id : ");
//		rEmail = sc.next();
//
//		System.out.println("Enter Password : ");
//		rPasswd = sc.next();
		
		LoggedInUser loggedInUser=new LoggedInUser();
		//LoginStatus ls;
		//User user = null;

		for(User u:users)
		{
			if(u.getEmail().equals(rEmail))
			{
			//	user=u;
				loggedInUser.setUser(u);
				break;
			}
				
		}
		if(loggedInUser.getUser()!=null)//????????????????????????????????????????????????????????????????????????????????????????
		{
			if(loggedInUser.getUser().getPwd().equals(rPasswd))
				{
					//System.out.println("Login successful.");
					//ls= LoginStatus.Success;
					loggedInUser.setLoginStatus(LoginStatus.Success);
				}
				else
				{
					//System.out.println("Password Incorrect!");
					//ls= LoginStatus.PasswordIncorrect;
					loggedInUser.setLoginStatus(LoginStatus.PasswordIncorrect);
				}
			}
			else
			{
				//System.out.println("User Id does not exist..Please sign up");
					//ls= LoginStatus.UserNotFound;
					loggedInUser.setLoginStatus(LoginStatus.UserNotFound);
			}
				return loggedInUser;
			}


	
public boolean subscription(Scanner sc, User u)
{
	boolean status=false;

	Subscription subscription=new Subscription();
	subscription.setUserId(u.getUserId());
	subscription.setDateOfSubscription(LocalDate.now());
	subscription.setValidity(LocalDate.now().plusMonths(2));
	
	subscriptions.add(subscription);
	System.out.println("Payment successful...awaiting approval!");
	status=true;
	return status;
}

	
public boolean approvePayment( Scanner sc)
{
		boolean status=false;
	for(Subscription s: subscriptions)
	{
		if(!s.isApproved())
			System.out.println("UserId\t"+ "Date of subscription"+"Validity");
		{
			System.out.println(s.getUserId()+ "\t" +s.getDateOfSubscription()+"\t"+ s.getValidity());
			/*
			 * showAllProperties from subscription as table.
			 * 
			 */
			System.out.print("Enter the Userid to approve subscription: " );
			int userIdToApprove=sc.nextInt();
			
				
		}
	}
return status;
}
		
public boolean borrow(Scanner sc, int userId, int bookId )
		{
			boolean bookBorrowStatus=false;
			Subscription sk=null;
			BookBorrow bookBorrow=new BookBorrow();
			
			for(Subscription s:subscriptions)
			{
				if(s.getUserId()==userId)
				{
					sk=s;
					break;
				}
			}
			if(sk!=null)
			{
				if(sk.getValidity().isBefore(LocalDate.now()))
			    		 {
			    	 		sk.setApproved(false);
			    	 		System.out.println("Subscription expired..Please renew to avail the facility!");
			    		 }
			     		else
			     			{
			     				bookBorrow.setUserId(userId);
			     				bookBorrow.setBookId(bookId);
			     				bookBorrow.setBorrowDate(LocalDate.now());
			     				bookBorrow.setReturnDate(LocalDate.now().plusWeeks(2));
			     				booksBorrow.add(bookBorrow);
			     				System.out.println("Request sent for book-borrow...awaiting approval!");
			     				bookBorrowStatus=true;
			     			}
			}
			else
			{
				System.out.println("Please subscribe to avail the services!");	
			}
			return bookBorrowStatus;
		}
	
			
		
		
	

	
	
	
	
	// ask liberarian to enter subscription id to approve.
	//search subscription by sub id.
	//In this subs object setApproved=true;

}


