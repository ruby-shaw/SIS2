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
	
	
}
