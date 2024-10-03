package test_prepration_15_sep_2024;

import java.util.*;

public class Calculator {

	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Number");
		int a = sc.nextInt();
		
		System.out.println(" Enter the 2nd Number");
		int b = sc.nextInt();
		
		System.out.println(" enter the operation '+' add '-' substract '*' multiple '/' divide");
		
		char ch = sc.next().charAt(0);
		
		switch (ch)
		{
		case '+' :
			System.out.println(a+b);
			break;
		case '-' :
			System.out.println(a-b);
			break;
		case '*' :
			System.out.println(a*b);
			break;
		case '/' :
			System.out.println(a/b);
			break;
			
		default :
			System.out.println(" Enter the valid operation");
		}
	}
}
