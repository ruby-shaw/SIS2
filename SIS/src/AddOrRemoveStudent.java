import java.util.Scanner;

public class AddOrRemoveStudent
	{

		public static void addStudent()
		{
			Scanner user1= new Scanner(System.in);
			String newFirst;
			String newLast;
			String newFirstP;
			String newSecP;
			String newThirdP;
			String newFirstG;
			String newSecG;
			String newThirdG;
			
			
			System.out.println("First Name?");
			newFirst = user1.next();
			System.out.println("Last Name?");
			newLast = user1.next();
			
			// make an arraylist of classes? then add grade after? figure out how to be a while there are still things left in the array list
			//So basically remove a class from the arraylist while they choose it and also assign it to the variable
			System.out.println("1) Biology");
			System.out.println("2) Algrebra");
			System.out.println("3) English");
			System.out.println("First Period?");
			int choice= user1.nextInt();
			
			
		}
	}
