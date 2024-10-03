package test_prepration_02_09_2024;

public class Palindrome_number_100_to_200 {

	public static void main(String[]args)
	{
		int i = 200;
		
		for(int n=100; n<=i; n++)
		{
			int n1 = n;
			int ld=0;
			int rev = 0;
			
			while(n1>0)
			{
				ld=n1%10;
				n1=n1/10;
				rev =(rev*10)+ld;
			}
			
			if(rev== n)
			{
				System.out.println(n +" Palindrome number")
			}
					
		}
	}
}
