import java.io.File;

import java.io.FileNotFoundException;
import java.util.ArrayList; 
import java.util.Scanner;
import java.text.DecimalFormat;

public class GpaCalculator
	{
		
		public static void Calc()
		{
			
			SIS.counter=0;
		for (int i = 0; i<SIS.roster.size();i++)
			{
			
				whatTypeOfGrade1();
				whatTypeOfGrade2();
				whatTypeOfGrade3();
				SIS.GPA/=3;
				String num = SIS.cs.format(SIS.GPA);
				double gpaFr = Double.parseDouble(num);
				SIS.roster.get(SIS.counter).setGpa(gpaFr);
				SIS.counter++;
				SIS.GPA=0;
			}
		}
		public static void whatTypeOfGrade1()
		{
			
			switch(SIS.roster.get(SIS.counter).getGrade1())
			{
				case "A+":
				      SIS.GPA+=4.30;
				break;
				case "A":
				         SIS.GPA+=4.00;
				break;
				case "A-":
					      SIS.GPA+=3.70;
					break;
				case "B+":
				         SIS.GPA+=3.30;
				break;
				case "B":
						SIS.GPA+=3.00;
				break;
				case "B-":
						SIS.GPA+=2.70;
				break;
				case "C+":
			         SIS.GPA+=2.30;
			    break;
				case "C":
					SIS.GPA+=2.00;
			    break;
				case "C-":
					SIS.GPA+=1.70;
				break;
				case "D+":
			         SIS.GPA+=1.30;
			    break;
				case "D":
					SIS.GPA+=1.00;
			    break;
				case "D-":
					SIS.GPA+=0.70;
				break;
				case "F":
					SIS.GPA+=0.00;
				break;	
			}
		
		
		}
		public static void whatTypeOfGrade2()
			{
				
				switch(SIS.roster.get(SIS.counter).getGrade2())
				{
					case "A+":
					      SIS.GPA+=4.30;
					break;
					case "A":
					         SIS.GPA+=4.00;
					break;
					case "A-":
						      SIS.GPA+=3.70;
						break;
					case "B+":
					         SIS.GPA+=3.30;
					break;
					case "B":
							SIS.GPA+=3.00;
					break;
					case "B-":
							SIS.GPA+=2.70;
					break;
					case "C+":
				         SIS.GPA+=2.30;
				    break;
					case "C":
						SIS.GPA+=2.00;
				    break;
					case "C-":
						SIS.GPA+=1.70;
					break;
					case "D+":
				         SIS.GPA+=1.30;
				    break;
					case "D":
						SIS.GPA+=1.00;
				    break;
					case "D-":
						SIS.GPA+=0.70;
					break;
					case "F":
						SIS.GPA+=0.00;
					break;	
				}
			
			
			}
		public static void whatTypeOfGrade3()
			{
				
				switch(SIS.roster.get(SIS.counter).getGrade3())
				{
					case "A+":
					      SIS.GPA+=4.30;
					break;
					case "A":
					         SIS.GPA+=4.00;
					break;
					case "A-":
						      SIS.GPA+=3.70;
						break;
					case "B+":
					         SIS.GPA+=3.30;
					break;
					case "B":
							SIS.GPA+=3.00;
					break;
					case "B-":
							SIS.GPA+=2.70;
					break;
					case "C+":
				         SIS.GPA+=2.30;
				    break;
					case "C":
						SIS.GPA+=2.00;
				    break;
					case "C-":
						SIS.GPA+=1.70;
					break;
					case "D+":
				         SIS.GPA+=1.30;
				    break;
					case "D":
						SIS.GPA+=1.00;
				    break;
					case "D-":
						SIS.GPA+=0.70;
					break;
					case "F":
						SIS.GPA+=0.00;
					break;	
				}
			
			
			}
	}