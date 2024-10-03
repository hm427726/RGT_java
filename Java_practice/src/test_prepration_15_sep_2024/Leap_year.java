package test_prepration_15_sep_2024;

public class Leap_year {

	public static void main(String[]args)
	{
//		int yr= 2022;
//		
//		if(yr%100==0 && yr%400==0 || yr%100!=0 && yr%4==0)
//		{
//			System.out.println(yr +" Leap Year");
//		}
//		else
//		{
//			System.out.println(yr+" Not a leap year");
//		}
		
		
		int yr= 1999;
		
		if(yr%100==0)
		{
			if(yr%400==0)
			{
				System.out.println(" Leap year");
			}
			else
			{
				System.out.println(" Leap year");
			}
		}
		else
		{
			if(yr%4==0)
			{
				System.out.println("leap year");
			}
			else
			{
				System.out.println(" not a leap year");
			}
		}
	
		
	}
}
