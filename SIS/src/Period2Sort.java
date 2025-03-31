import java.util.Comparator;

public class Period2Sort implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) 
	{
		return o1.getPeriod2().compareTo(o2.getPeriod2());
	}

}