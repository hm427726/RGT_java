package prepration_for_2_sep_2024_test;

public class Factorial_of_a_number_using_for_loop {

	public static void main(String[]args)
	{
		int fact=1;
		int i =5;
		
		for(int n=1; n<=i;n++)
		{
			fact=fact*n;
			
		}
		System.out.println(fact);
	}
}
