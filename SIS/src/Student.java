
public class Student
	{
		private String firstName;
		private String lastName;
		private double gpa;
		private String period1;
		private String grade1;
		private String period2;
		private String grade2;
		private String period3;
		private String grade3;
	
public Student(String f, String l, double g, String p1, String g1, String p2, String g2, String p3, String g3 )
{

	firstName=f;
	lastName=l;
	gpa = g;
	period1=p1;
	grade1=g1;
	period2=p2;
	grade2=g2;
	period3=p3;
	grade3=g3;	
}

public String getFirstName()
{
return firstName;
}

public void setFirstName(String f)
{
firstName=f; 	
}

public String getLastName()
{
return lastName;
}

public void setLastName(String l)
{
lastName=l; 	
}
public double getGpa()
{
return gpa; 
}
public void setGpa(double g)
{
	
gpa=g;

}
public String getPeriod1()
{
return period1;
}

public void setPeriod1(String p1)
{
period1=p1; 	
}

public String getGrade1()
{
return grade1;
}

public void setGrade1(String g1)
{
grade1=g1; 	
}
public String getPeriod2()
{
return period2;
}

public void setPeriod2(String p2)
{
period2=p2; 	
}

public String getGrade2()
{
return grade2;
}

public void setGrade2(String g2)
{
grade2=g2; 	
}
public String getPeriod3()
{
return period3;
}

public void setPeriod3(String p3)
{
period3=p3; 	
}

public String getGrade3()
{
return grade3;
}

public void setGrade3(String g3)
{
grade3=g3; 	
}

	}
