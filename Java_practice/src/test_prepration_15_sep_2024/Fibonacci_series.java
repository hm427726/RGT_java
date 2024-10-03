package test_prepration_15_sep_2024;

public class Fibonacci_series {

	public static void main(String[]args)
	{
		int a =0;
		int b=1;
		
		System.out.print(a+" ");
		System.out.print(b+" ");
		
		int last_term=8;
		
		for(int i=1; i<=last_term-2; i++)
		{
			int c=a+b;
			
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}
