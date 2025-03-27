import java.util.Scanner;

public class ChangeSchedulesOrGrades
	{
		public static Scanner user= new Scanner (System.in);
		public static void pick()
		{
		System.out.println("Pick one");
		System.out.println("1) Change grade");
		System.out.println("2) Change schedule");
		int changeGradeorSchedule=user.nextInt();
		if ( changeGradeorSchedule==1)
			{
				changeGrade();
			}
		else if ( changeGradeorSchedule==2)
			{
				changeSchedule();
			}
		else
			{
				System.out.println("Error, please try again");
			 changeGradeorSchedule=user.nextInt();
			}
		}
		
		public static void changeGrade()
		{
		System.out.println("Which student's grades would you like to change?");
		int num=0;
		for (Student k : SIS.roster)
			{
				num++;
				System.out.println(num+") "+k.getFirstName()+ " "+ k.getLastName() + " " + k.getPeriod1()+ " "+ k.getGrade1()+ " " + k.getPeriod2()+ " "+ k.getGrade2()+ " " + k.getPeriod3()+ " "+ k.getGrade3());
			}
		int p = user.nextInt();
		p--; 
		System.out.println();
		System.out.println("1)"+ SIS.roster.get(p).getPeriod1() +": "+SIS.roster.get(p).getGrade1() );
		System.out.println("2)"+ SIS.roster.get(p).getPeriod2() +": "+SIS.roster.get(p).getGrade2() );
		System.out.println("3)"+ SIS.roster.get(p).getPeriod3() +": "+SIS.roster.get(p).getGrade3() );
		System.out.println();
		System.out.println("Which class?");
		int c= user.nextInt();
		if (c==1)
			{
				System.out.println();
				System.out.println("What would you like the grade to be?");
				String g=user.next();
				SIS.roster.get(p).setGrade1(g);
				System.out.println(SIS.roster.get(p).getPeriod1() +": "+SIS.roster.get(p).getGrade1());
			}
		else if (c==2)
			{
				System.out.println();
				System.out.println("What would you like the grade to be?");
				String g=user.next();
				SIS.roster.get(p).setGrade2(g);
				System.out.println(SIS.roster.get(p).getPeriod2() +": "+SIS.roster.get(p).getGrade2());
			}
		else if (c==3)
			{
				System.out.println();
				System.out.println("What would you like the grade to be?");
				String g=user.next();
				SIS.roster.get(p).setGrade3(g);
				System.out.println(SIS.roster.get(p).getPeriod3() +": "+SIS.roster.get(p).getGrade3());
			}
		else
			{
				System.out.println("Error, please try again");
				c=user.nextInt();
			}
		
		System.out.println("Would you like to 1) Change another grade or 2) Return to Menu?");
		int f= user.nextInt();
		if (f==1)
			{
				changeGrade();
			}
		else if (f==2)
			{
				SIS.menu();
			}
		else
			{
				System.out.println("Error, please try again");
				f=user.nextInt();
			}
		
		}
		
		public static void changeSchedule()
		{
			
		}
	}
