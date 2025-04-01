import java.util.ArrayList;
import java.util.Collections;

public class SortStudent 
{
	public static ArrayList<Student> sortByLastName()
	{
		ArrayList <Student> sorted = new ArrayList <Student>();
		
		for(Student s: SIS.roster)
		{
			sorted.add(s);
		}
		
		Collections.sort(sorted, new LastNameSort());
		return sorted;

	}
	
	public static ArrayList<Student> sortByPeriod1()
	{
		ArrayList <Student> sortedBy1 = new ArrayList <Student>();
		
		
		for(Student s: SIS.roster)
		{
			sortedBy1.add(s);
		}
		
		Collections.sort(sortedBy1, new Period1Sort());
		
		return sortedBy1;
	}
	
	public static ArrayList<Student> sortByPeriod2()
	{
		ArrayList <Student> sortedBy2 = new ArrayList <Student>();
		
		
		for(Student s: SIS.roster)
		{
			sortedBy2.add(s);
		}
		
		Collections.sort(sortedBy2, new Period2Sort());
		
		return sortedBy2;
	}
	
	public static ArrayList<Student> sortByPeriod3()
	{
		ArrayList <Student> sortedBy3 = new ArrayList <Student>();
		
		
		for(Student s: SIS.roster)
		{
			sortedBy3.add(s);
		}
		
		Collections.sort(sortedBy3, new Period3Sort());
		
		return sortedBy3;
	}
}
