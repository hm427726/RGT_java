package function_practice;

public class Even_number_between_1_to_100 {

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
			Even_number_between_1_to_100.even(i);
		}
	}
}
