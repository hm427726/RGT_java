package test_prepration_02_09_2024;

public class Swap_2_variable_using_3rd_variable {

	public static void main(String[]args)
	{
//		int a = 5;
//		int b = 10;
//		int c =0;
//		
//		c=b;
//		b=a;
//		a=c;
//		System.out.println(a);
//		System.out.println(b);
		
		int a = 10;
		int b = 5;
		
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println(a);
		System.out.println(b);
	}
}
