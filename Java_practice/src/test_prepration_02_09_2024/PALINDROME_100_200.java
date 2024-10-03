package test_prepration_02_09_2024;

public class PALINDROME_100_200 {

	public static void main(String[]args)
	{
		int i = 200;
		
		for(int n1=100; n1<=i;n1++)
		{
			int n = n1;
			int ld = 0;
			int rev = 0;
			
			while(n>0)
			{
				ld= n%10;
				n=n/10;
				rev=(rev*10)+ld;
			}
			
			if(rev ==n1)
			{
				System.out.println(n1 + " Palindrome Number");
			}
		}
	}
}
