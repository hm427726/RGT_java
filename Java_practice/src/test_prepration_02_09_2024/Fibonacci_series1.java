package test_prepration_02_09_2024;

public class Fibonacci_series1 {

	public static void main(String[]args)
	{
		int a = 0;
		int b = 1;
		
		System.out.print(a + " ");
		System.out.print(b + " ");
		
		int last_term=8;
		
		while(a<=last_term-2)
		{
			int c= a+b;
			System.out.print(c +" ");
			a=b;
			b=c;
		}
	}
}
