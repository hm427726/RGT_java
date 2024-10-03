package test_prepration_02_09_2024;

public class Factorial_of_3_to_10 {

	public static void main(String[]args)
	{
		int i =10;
		int fact = 1;
		
		for(int n = 3; n<=i; n++)
		{
			fact = fact*n;
		}
		System.out.print(fact);
	}
}
