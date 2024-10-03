package function;

public class Print_all_even_number_using_function {

	public static void even(int x)
	{
		if(x%2==0)
		{
			System.out.println(x);
		}
	}
	
	public static void main(String[]args)
	{
		for(int i=1; i<=100; i++)
		{
			Print_all_even_number_using_function.even(i);
		}
	}
}
