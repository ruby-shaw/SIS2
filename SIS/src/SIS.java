import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList; 
import java.util.Scanner;
import java.text.DecimalFormat;
public class SIS
	{
		static ArrayList <Student> roster = new ArrayList <Student>();
		static int counter = 0;
		public static void main(String[] args)
			{
				String file1 = "StudentList.txt"; 
		

				//for loop through get grade use if else to add a certain number to gpa
				// make a seperate array list for gpa ):
				// 
		
				try
					{
						Scanner myFile = new Scanner (new File("StudentList.txt"));
						while(myFile.hasNext())
							{
								roster.add(new Student(myFile.next(),myFile.next(),0.00,myFile.next(),myFile.next(),myFile.next(),myFile.next(),myFile.next(),myFile.next()));
								
							}
						GpaCalculator.whatTypeOfA();
						for (int i = 0; i<roster.size();i++)
							{
								if (roster.get(i).getGrade1().equals("A")|| roster.get(i).getGrade1().equals("A-")||roster.get(i).getGrade1().equals("A+"))
									{
									
									}
							counter++;
							}
						
						for (Student k : roster)
							{
								System.out.println(k.getFirstName()+ " "+ k.getLastName() + " " + k.getPeriod1()+ " "+ k.getGrade1()+ " " + k.getPeriod2()+ " "+ k.getGrade2()+ " " + k.getPeriod3()+ " "+ k.getGrade3());
								
							}
						System.out.println(roster.size());
						
						
						
					} catch (FileNotFoundException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}


			}

		
	}
