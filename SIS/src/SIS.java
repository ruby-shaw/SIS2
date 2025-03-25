import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList; 
import java.util.Scanner;
import java.text.DecimalFormat;

public class SIS
	{

	public static ArrayList <Student> roster = new ArrayList <Student>();
	public static Scanner user= new Scanner (System.in);


		static	double GPA = 0.00;

		static int counter = 0;

		public static void main(String[] args)
			{
				String file1 = "StudentList.txt"; 
		

				//for loop through get grade use if else to add a certain number to gpa
				// make a seperate array list for gpa ):
				// 
				
			
				System.out.println(roster.size());
			

	
	
					fillArray();
					menu();
			
			}
		public static void fillArray()

		{
			String file1 = "StudentList.txt"; 
			
			

			try
				{
					Scanner myFile = new Scanner (new File("StudentList.txt"));
					while(myFile.hasNext())
						{

							roster.add(new Student(myFile.next(),myFile.next(),myFile.next(),myFile.next(),myFile.next(),myFile.next(),myFile.next(),myFile.next()));
							roster.add(new Student(myFile.next(),myFile.next(),0.00,myFile.next(),myFile.next(),myFile.next(),myFile.next(),myFile.next(),myFile.next()));
							
						}
					for (Student k : roster)
						{
							System.out.println(k.getFirstName()+ " "+ k.getLastName() + " " + k.getPeriod1()+ " "+ k.getGrade1()+ " " + k.getPeriod2()+ " "+ k.getGrade2()+ " " + k.getPeriod3()+ " "+ k.getGrade3());
						}
					
					
					
					
				} catch (FileNotFoundException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}	
		public static void menu()
			{
				System.out.println("What would you like to do?");
				System.out.println("1) Add or delete student");
				System.out.println("2) Change students grades or schedules");
				System.out.println("3) Sort Students");
				int choice= user.nextInt();
				if (choice ==1)

					{
						System.out.println("Pick one");
						System.out.println("1) Add a Student");
						System.out.println("2) Delete a Student");
						int addOrDeleteChoice=user.nextInt();
						if (addOrDeleteChoice==1)
							{

								
								
							
						
					 

								System.out.println("Link add students method");
							}
						else if (addOrDeleteChoice==2)
							{
								System.out.println("link delete students method");
							}
						else 
							{
								System.out.println("Error, please try again");
							}
						
					}
				else if (choice ==2)

					{
						System.out.println("Pick one");
						System.out.println("1) Change grade");
						System.out.println("2) Change schedule");
						int changeGradeorSchedule=user.nextInt();
						if ( changeGradeorSchedule==1)
							{
								System.out.println("Link grade method");
							}
						else if ( changeGradeorSchedule==2)
							{
								System.out.println("link schedule method");
							}
						else
							{
								System.out.println("Error, please try again");
							}
						
					}

				else if (choice ==3)
					{
						System.out.println("Pick one");
						System.out.println("1) Sort by last name");
						System.out.println("2) Sort by GPA");
						System.out.println("2) Sort by period");
						int sortChoice=user.nextInt();
						if ( sortChoice==1)
							{
								System.out.println("Link last name method");
							}
						else if ( sortChoice==2)
							{
								System.out.println("link GPA method");
							}
						else if ( sortChoice==3)
							{
								System.out.println("link period method");
							}
						else
							{
								System.out.println("Error, please try again");
							}
						
					}	
				}
			}

	
		
		public static void deleteStudents()
		{
			Scanner userDel = new Scanner(System.in);
			System.out.println("Pick a student to delete");
			int pickDelete= userDel.nextInt();
			for (int d=0; d<SIS.roster.size(); d++)
				{   
					
				}
			
		}
		
	
