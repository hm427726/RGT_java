package capsule_15;

public class Print_all_the_factorial_between_3_to_10 {

	public static void main(String[]args)
	{
		int i = 10;
		int fact = 1;
		
		for(int n = 3; n<=i; n++)
		{
			fact = fact*n;
			System.out.println("factorial of " + n + " = " +fact);
		}
	}
}
