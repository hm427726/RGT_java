package function;

public class Leap_year_function {

	public static void main(String[]args)
	{
		Leap_year_function ob = new Leap_year_function();
		
		int yr=2019;
		
		boolean res= ob.check(yr);
		ob.Display(res);
		
		
	}
	
	public boolean check(int yr)
	{
		if(yr%100==0 && yr%400==0 || yr%100!=0 && yr%4==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void Display(boolean res)
	{
		if(res==true)
		{
			System.out.println(" Leap_Year");
		}
		else
		{
			System.out.println(" Not_A_Leap_Year");
		}
	}
}
