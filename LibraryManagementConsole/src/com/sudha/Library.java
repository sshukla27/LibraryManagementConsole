package com.sudha;

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
		booksBorrow=new ArrayList<BookBorrow>();
		
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
		book.setBookId(sc.nextInt());

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
		
		System.out.println("Enter the book name you want to edit:");
		String editable=sc.next();
		int bookIndex=0;
		for(int i=0; i<books.size();i++)
		{
			
		
			if(books.get(i).getBookName().equals(editable))
			{
				bookIndex=i;
				break;
			}
		}
		
			if(bookIndex!=0)
			{
				Book bk=new Book();
				//String uInput=getInput();
				//System.out.print("Book Id : ");
				//bk.setBookId(sc.nextLong());

				System.out.print("\nBook Name : ");
				//uInput = getInput();
				books.get(bookIndex).setBookName(getInput());

				System.out.print("\nAuthor : ");
				//uInput = getInput();
				//bk.setAuthor(getInput());
				books.get(bookIndex).setAuthor(getInput());
//				System.out.print("\nReview : ");
//				book.setReview(sc.nextInt());

				System.out.print("\nEdition : ");
				books.get(bookIndex).setEdition(sc.nextInt());

				System.out.print("\nQuantity : ");
				books.get(bookIndex).setQuantitiy(sc.nextInt());

				System.out.print("\nGenre : ");
				//uInput = getInput();
				books.get(bookIndex).setGenre(getInput());
				System.out.print("successfully edited" + "\n\n");
			}
			else 
			{
				System.out.println("The book "+editable+" does not exist in Library");
			}
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
	public boolean signUp(Scanner sc)//sign up
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
				if(b.getBookName().toLowerCase().contains(searchOption.toLowerCase()) || b.getAuthor().toLowerCase().contains(searchOption.toLowerCase())|| b.getGenre().toLowerCase().contains(searchOption.toLowerCase()))
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
		
		LoggedInUser loggedInUser=new LoggedInUser();

		for(User u:users)
		{
			if(u.getEmail().equals(rEmail))
			{
				loggedInUser.setUser(u);
				break;
			}
		}
		if(loggedInUser.getUser()!=null)
		{
			if(loggedInUser.getUser().getPwd().equals(rPasswd))
				{
					loggedInUser.setLoginStatus(LoginStatus.Success);
				}
				else
				{
					loggedInUser.setLoginStatus(LoginStatus.PasswordIncorrect);
				}
			}
			else
			{
					loggedInUser.setLoginStatus(LoginStatus.UserNotFound);
			}
				return loggedInUser;
			}


	
public boolean subscription(Scanner sc, User u)
{
	boolean status=false;

	Subscription subscription=new Subscription();
	subscription.setSubscriptionId(subscriptions.size()+1);
	subscription.setUserId(u.getUserId());
	subscription.setDateOfSubscription(LocalDate.now());
	subscription.setValidity(LocalDate.now().plusMonths(2));
	subscription.setApproved(false);
	subscriptions.add(subscription);
	System.out.println("Payment successful...awaiting approval!");
	status=true;
	return status;
}

	
public boolean approval( Scanner sc)
{
		boolean status=false;
		int userIdToApprove;
		Subscription s = null;
		System.out.println("Choose one option for APPROVAL : \n"+
							"1- Subscription\n"+
							"2- Borrow Book\n+"+ 
							"3- Return Book ");
		int approve=sc.nextInt();
		
	switch(approve)
	{
		case 1://approval for subscription
			for(Subscription sk: subscriptions)
			{
				if(!sk.isApproved())
				{
					System.out.println(sk.getSubscriptionId()+ sk.getUserId()+ "\t" +sk.getDateOfSubscription()+"\t"+ sk.getValidity());	
				}
			}
			System.out.print("Enter subscription Id to update :");
			int sId=sc.nextInt();
			System.out.print("\n Choose one option\n 1-To approve subscription: \n 2- To reject subscription due to payment failure");
					userIdToApprove=sc.nextInt();

					switch(userIdToApprove)
					{	
						case 1 :
						for(int i=0; i<subscriptions.size();i++)
						{
							if(subscriptions.get(i).getSubscriptionId()==sId)
							{
								subscriptions.get(i).setApproved(true);
								break;
							}
						}
						break;						
					
						case 2 :
							for(int i=0; i<subscriptions.size();i++)
							{
								if(subscriptions.get(i).getSubscriptionId()==sId)
								{
									subscriptions.remove(i);
									break;
								}
							}
							break;						
					}
					status=true;
		 break;
		case 2:
//			Borrow Book start
			for(BookBorrow bb : booksBorrow)
			{
				if(!bb.isBorrowApproved())
				{
					System.out.println(bb.getBookBorrowId()+" "+bb.getBookName()+" "+bb.getUserId());	
				}
			}
			System.out.print("Enter BookBorrow Id to update :");
			int bbId=sc.nextInt();
			System.out.print("\n Choose one option\n 1-To approve borrow: \n 2- To reject borrow");
					int bbOption=sc.nextInt();

					switch(bbOption)
					{	
						case 1 :
						for(int i=0; i<booksBorrow.size();i++)
						{
							if(booksBorrow.get(i).getBookBorrowId() ==bbId)
							{
								booksBorrow.get(i).setBorrowApproved(true);
								break;
							}
						}
						break;						
					
						case 2 :
							for(int i=0; i<booksBorrow.size();i++)
							{
								if(booksBorrow.get(i).getBookBorrowId()==bbId)
								{
									booksBorrow.remove(i);
									break;
								}
							}
							break;						
					}
					status=true;
//			Borrow Book end
					
					
			break;
			default :
				break;
	}
					return status;
}
		
public boolean borrow(Scanner sc, User u  )
		{
			boolean bookBorrowStatus=false;
			Subscription sk=null;
			Book bk=null;
			BookBorrow bookBorrow=new BookBorrow();
			
			for(Subscription s:subscriptions)
			{
				if(s.getUserId()==u.getUserId())
				{
					sk=s;
					break;
				}
			}
			if(sk!=null)
			{
				if(sk.getValidity().isBefore(LocalDate.now()))//if there is no subscription
			    		 {
			    	 		sk.setApproved(false);
			    	 		System.out.println("Subscription expired..Please renew to avail the facility!");
			    	 		subscriptions.remove(sk);
			    		 }
			     		else
			     			{
			     				System.out.print("Enter Book name you want to borrow :");
			     				String bookInput=getInput();
			     				for(Book b: books)
			     				{
			     					if(b.getBookName().toLowerCase().contains(bookInput.toLowerCase()))
			     					{
			     						bk=b;
			     					}
			     				}

			     				if(bk!=null)
			     				{
			     					bookBorrow.setUserId(u.getUserId());
			     					bookBorrow.setBookId(bk.getBookId());
			     					bookBorrow.setBookName(bookInput);
			     					bookBorrow.setBorrowDate(LocalDate.now());
			     					bookBorrow.setReturnDate(LocalDate.now().plusWeeks(2));
			     					bookBorrow.setBorrowApproved(false);
			     					booksBorrow.add(bookBorrow);
			     					System.out.println("Request sent for book-borrow...awaiting approval!");
			     					bookBorrowStatus=true;
			     				}
			     				else
			     				{
			     					System.out.println("The book is not available!");
			     				}
			     			}
			}
			else
			{
				System.out.println("Please subscribe to avail the services!");	
			}
			return bookBorrowStatus;
		}
 
public void review(Scanner sc, User user  )
{
	 Review review=new Review();
	 System.out.print("Enter the BookId you want to give feedback about : ");
	 review.setBookId(sc.nextInt());
	 
	 review.setUserId(user.getUserId());
	 review.setReviewId(review.reviewId+1);

	 System.out.print("How many starts you rate it with : ");
	 review.setStars(sc.nextInt());
	 
	 System.out.println("Any Comment or feedback : ");
	 review.setComment(getInput());
	 
	 reviews.add(review);
	 
	 System.out.print("Thank you for your the review! ");
	 //apporval property not added in this class because reader is entitled to give his review whether it's good or bad.
}
			
public void addFeedback(Scanner sc, User user)
{
	
	CustomerFeedback feedback=new CustomerFeedback();
	System.out.println("Please drop your feedback here : ");
	feedback.setComment(getInput());
	feedback.setReaderID(user.getUserId());
	feedback.setApproved(false);
	feedbacks.add(feedback);

	System.out.println("Thank you for your feedback! We are commited to better out services with your feedback :)");
}

}


