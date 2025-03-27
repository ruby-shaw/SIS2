import java.util.Scanner;
public class ChangeSchedulesOrGrades
	{
		public void pick()
		{
		System.out.println("Pick one");
		System.out.println("1) Change grade");
		System.out.println("2) Change schedule");
		int changeGradeorSchedule= SIS.user.nextInt();
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
	}
