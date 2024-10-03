package test_prepration_for_30_sep_2024;

public class Even_Number_using_function {

	public static void main(String[]args)
	{
		for(int i=1; i<=100; i++)
		{
			Even_Number_using_function.even(i);
		}
	}
	
	public static void even (int i)
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
	}
}
