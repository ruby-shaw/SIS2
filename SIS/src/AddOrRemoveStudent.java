import java.util.ArrayList;
import java.util.Scanner;

public class AddOrRemoveStudent

	{
		static Scanner user1= new Scanner(System.in);
		
	public static void choose()
	{
		System.out.println("Pick one");
		System.out.println("1) Add a Student");
		System.out.println("2) Delete a Student");
		int addOrDeleteChoice=user1.nextInt();
		if (addOrDeleteChoice==1)
			{
				addStudent();
			}
		else if (addOrDeleteChoice==2)
			{
				removeStudent();
			}
		else 
			{
				System.out.println("Error, please try again");
			}
	}
		public static void addStudent()
		{
			
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
			ArrayList <String> classes = new ArrayList <String>();
			classes.add("Biology");
			classes.add("Algrebra");
			classes.add("English");
			
			System.out.println("1) "+ classes.get(0));
			System.out.println("2) "+ classes.get(1));
			System.out.println("3) "+ classes.get(2));
			System.out.println("First Period?");
			int choice= user1.nextInt();
			choice--;
			newFirstP= classes.get(choice);
			classes.remove(choice);	
			System.out.println("What is the grade for "+ newFirstP+ "?");
			newFirstG= user1.next();
			
			
			
			System.out.println("Second Period?");
			System.out.println("1) "+ classes.get(0));
			System.out.println("2) "+ classes.get(1));
			choice=user1.nextInt();
			choice--; 
			newSecP= classes.get(choice);
			classes.remove(choice);
			System.out.println("What is the grade for "+ newSecP+ "?");
			newSecG= user1.next();
			
			newThirdP= classes.get(0); 
			System.out.println("What is the grade for "+ newThirdP+ "?");
			newThirdG= user1.next();
			
			
			SIS.roster.add(new Student(newFirst, newLast, 0.00, newFirstP, newFirstG, newSecP, newSecG, newThirdP, newThirdG));
			GpaCalculator.Calc();
			int num=0;
			for (Student k : SIS.roster)
				{
					num++;
					System.out.println(num+") "+k.getFirstName()+ " "+ k.getLastName() + " "+  k.getGpa()+  " " + k.getPeriod1()+ " "+ k.getGrade1()+ " " + k.getPeriod2()+ " "+ k.getGrade2()+ " " + k.getPeriod3()+ " "+ k.getGrade3());
				}
			SIS.menu();
			
		}
		
		public static void removeStudent()
		{
			int num=0;
			for (Student k : SIS.roster)
				{
					num++;
					System.out.println(num+") "+k.getFirstName()+ " "+ k.getLastName() + " " +  k.getGpa()+  " " + k.getPeriod1()+ " "+ k.getGrade1()+ " " + k.getPeriod2()+ " "+ k.getGrade2()+ " " + k.getPeriod3()+ " "+ k.getGrade3());
				}
			System.out.println("Which student would you like to remove?");
			int choice= user1.nextInt();
			choice--;
			SIS.roster.remove(choice);
			
			int newNum=0;
			System.out.println();
			for (Student k : SIS.roster)
				{
					newNum++;
					System.out.println(newNum+") "+k.getFirstName()+ " "+ k.getGpa() +" "+ k.getLastName() + " " + k.getPeriod1()+ " "+ k.getGrade1()+ " " + k.getPeriod2()+ " "+ k.getGrade2()+ " " + k.getPeriod3()+ " "+ k.getGrade3());
				}
			SIS.menu();
		}
	}
