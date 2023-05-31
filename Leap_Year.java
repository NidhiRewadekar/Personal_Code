import java.util.Scanner;

public class P9_Leap_Year 
{
	public static void Leap_Year()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter a year: ");
		int year=sc.nextInt();
		boolean is_the_year_leap=false;
		
		if(year%4==0)
		{
			is_the_year_leap=true;
			 System.out.println("The year is a leap year");
			
			if(year%100==0)
			{
				if(year%400==0)
				{
					is_the_year_leap=true;
				}
				
				else
				{
					is_the_year_leap=false;
					 System.out.println("The year is not a leap year");
				}
			}
		}
		
		else 
		{
			is_the_year_leap=false;
			 System.out.println("The year is not a leap year");
		}
		
	}
	public static void main(String[] args) 
	{
		Leap_Year();
	}
}
