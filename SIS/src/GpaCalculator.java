import java.io.File;

import java.io.FileNotFoundException;
import java.util.ArrayList; 
import java.util.Scanner;
import java.text.DecimalFormat;

public class GpaCalculator
	{
		
		public static void Calc()
		{
			
		for (int i = 0; i<SIS.roster.size();i++)
			{
				if (SIS.roster.get(i).getGrade1().equals("A")|| SIS.roster.get(i).getGrade1().equals("A-")||SIS.roster.get(i).getGrade1().equals("A+"))
					{
					
					}
				SIS.counter++;
			}
		}
		public static void whatTypeOfA()
		{
			
			switch(SIS.roster.get(SIS.counter).getGrade1())
			{
				case "A":
				SIS.GPA+=4.00;
				case "A+":
					SIS.GPA+=4.00;
				
			
			
			
			}
		
		
		}
	}