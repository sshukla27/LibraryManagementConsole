package Library_Management;

import java.util.Scanner;

import Library_Management.Library.LoginStatus;

public class libraryManagement
{

	public static void userMenu()
	{
		System.out.println("1 - Search Book\n" +"2 - Login Book\n"+ "3 - Sign up\n"+ "4 - Subscribe\n"+ "5 - Feedback\n"+
				"6 - Borrow book\n"+
				"7 - Return book\n"+
				"8 - To review book");
		System.out.print("\nChoose your option : ");
	}

	public static void main(String[] args) 
	{
		Library library = new Library();
		String librarianUserName = "admin";
		String librarianPassword = "0000";
		int input;
		char moreOperations='y';
		char moreUserOptions='Y';	
		boolean signUpStatus=false;
		String userName = null, passInput=null;	//to compare with librarian na me and password we need to assign value to user name and paswd
		//librarian name and password we need to assign value to user name and paswd because there should be value to compare with libraian username and Librarian pswd

		Scanner sc = new Scanner(System.in);
		LoggedInUser loggedInUser=null;
		
		do
		{//moreUserOptions='N';
			do
			{//moreOperationsForAdmin='N'
			
				System.out.println("Choose your option: ");
				System.out.println("1 - Admin Login\n"+"2 - User");
				input=sc.nextInt();
				//screen clear
				
				if(input==1) // Admin interface starts..
				{
					System.out.println("Enter User Name : ");
					userName=sc.next();
					System.out.println("Enter Password Name : ");
					passInput=sc.next();

				
					if(userName.equals(librarianUserName) && passInput.equals(librarianPassword))
					{
						do// admin's menu starts..
						{
							System.out.println("\n"+" 1 - Add Book\n"+ "2 - Show Books\n"+ "3 - Show Readers' Detail\n"
								+ "4 - Search\n"+ "4 - PaymentApproval");
							int lOperation = sc.nextInt();

							switch (lOperation) 
							{
								case 1: // Add Book

									library.addBook(sc);
								break;
								
								case 2 : //display books
							
								library.displayBooks();
								break;
								
								case 3 : //Display Readers' details
								library.displayReaders();
								break;
								
								case 4 : //To search
								library.search(sc);
								break;
								
								default :
								System.out.println("Wrong input");
								break;
							}
						
							System.out.print("Do you want more operations? Y/N :");
							moreOperations=sc.next().charAt(0);
						
						}while(moreOperations=='y' || moreOperations=='Y'); //Admin menu closes..
						System.out.println("admin Logged out..!");
						
						userName=null;
						passInput=null;
						
					//}while(moreOperations=='n' || moreOperations=='N');
				} //Admin's logout.
				else // Reader's interface Starts..
				{
					System.out.println("Dear Reader!..Welcome to our online library!");
								
					do //Reader's menu starts..
					{
						userMenu();			
						int rOperation = sc.nextInt();
		
						switch (rOperation) 
							{
								case 1 : //To search
										library.search(sc);
										break;
							
								case 2 : //To login
										loggedInUser=library.login(sc, userName, passInput);
										if(loggedInUser.getLoginStatus().equals(LoginStatus.Success))
										{
											System.out.println("Successfully Logged in!");
										}
										else if(loggedInUser.getLoginStatus().equals(LoginStatus.PasswordIncorrect))
										{
											System.out.println("Email ID or Password is incorrect.");
											library.login(sc, userName,passInput);
										}
										else if(loggedInUser.getLoginStatus().equals(LoginStatus.UserNotFound))
										{
											System.out.println("Email ID or Password is incorrect.");
											signUpStatus=library.signingUp(sc);
										}
										break;
								
								case 3 : //To SignUp
										library.subscription(sc, loggedInUser.getUser());
										break;
						
								case 4 : //To Subscribe
										library.subscription(sc, loggedInUser.getUser());
										break;

								case 5 : //To Feedback
										library.subscription(sc, loggedInUser.getUser());
										break;		

								case 6 : //To Borrow Book
										library.subscription(sc, loggedInUser.getUser());
										break;
								case 7 : //To Return Book
									library.subscription(sc, loggedInUser.getUser());
									break;
								case 8 : //To review Book
									library.subscription(sc, loggedInUser.getUser());
									break;
								default :
									System.out.println("Wrong input");
									break;
							}//Reader's menu closes.
						
								System.out.println("Do you want further options..(Y/N)? :");
								moreUserOptions=sc.next().charAt(0);
					}while(moreUserOptions=='Y' ||moreUserOptions=='y'); //reader's menu repeats..
					
					System.out.println("Logged out..!");
					userName=null;
					passInput=null;
				}
			}while(moreUserOptions=='N' ||moreUserOptions=='n');//reader's logOut
			}
		}
	}
}

			
		
