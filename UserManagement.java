import java.io.IOException;
import java.util.Scanner;

/**
 * Demonstrates the use of a map to manage a set of objects.
 * 
 */
public class UserManagement
{
	/**
	 * Creates and populates a Map of users. Then prompts for
	 * interactive searches, and finally prints all users.
	 */
	public static void main(String[] args) throws IOException
	{
		// create a HashMap to track users

		// add a new user to the user map
		// create a new user using, for example, 
		// new User("G3122", "Fred", "Kane")
		// do the above to add several users 

		Scanner scan = new Scanner(System.in);
		String uid;
		User user;

		do
		{
			System.out.print("Enter User Id (DONE to quit): ");
			uid = scan.nextLine();
			if (!uid.equalsIgnoreCase("DONE"))
			{
				// search the user map for the input uid

				// if not found 
					
				// display a "User Not Found" message 
				
				// otherwise print the user's full name 
			}

		} while (!uid.equalsIgnoreCase("DONE"));

		// print the number of users and
		// print all users in the user map
	}
}
