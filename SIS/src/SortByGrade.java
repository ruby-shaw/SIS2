import java.util.ArrayList;
import java.util.Collections;
public class SortByGrade
	{
		public static ArrayList <Student> roster2 = new ArrayList <Student>();
		public static ArrayList<Student>  sorter()
		{
	 ArrayList <Student> roster2 = new ArrayList <Student>();
				 
	 for(Student s: SIS.roster)
			{
				roster2.add(s);
			}
	 Collections.sort(roster2, new gradeSort());
		return roster2;
			 }

	}
		
		

