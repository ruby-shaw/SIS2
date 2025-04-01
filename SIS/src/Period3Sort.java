import java.util.Comparator;

public class Period3Sort implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) 
	{
		return o1.getPeriod3().compareTo(o2.getPeriod3());
	}

}