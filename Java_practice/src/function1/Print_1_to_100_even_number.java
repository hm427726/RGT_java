package function1;

public class Print_1_to_100_even_number {

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
			Print_1_to_100_even_number.even(i);
		}
	}
}
