package function_test_prepration;

public class Print_all_even_number_10_100 {

	public static void even(int n)
	{
		if(n%2==0)
		{
			System.out.println(n);
		}
	}
	
	public static void main(String[]args)
	{
		for(int i=1; i<=100; i++)
		{
			Print_all_even_number_10_100.even(i);
		}
	}
	
}
