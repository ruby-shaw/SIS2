import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList; 
import java.util.Scanner;
public class SIS
	{

		public static void main(String[] args)
			{
				String file1 = "StudentList.txt"; 
				ArrayList <Student> list = new ArrayList <Student>();

				//for loop through get grade use if else to add a certain number to gpa
				// make a seperate array list for gpa ):
				// 

				try
					{
						Scanner myFile = new Scanner (new File("StudentList.txt"));
						while(myFile.hasNext())
							{
								list.add(new Student(myFile.next(),myFile.next(),myFile.next(),myFile.next(),myFile.next(),myFile.next(),myFile.next(),myFile.next()));
								
							}
						for (Student k : list)
							{
								System.out.println(k.getFirstName()+ " "+ k.getLastName() + " " + k.getPeriod1()+ " "+ k.getGrade1()+ " " + k.getPeriod2()+ " "+ k.getGrade2()+ " " + k.getPeriod3()+ " "+ k.getGrade3());
							}
						
						
						
						
					} catch (FileNotFoundException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}


			}

		public void createGpa()
			{
				
		
			}
	}
