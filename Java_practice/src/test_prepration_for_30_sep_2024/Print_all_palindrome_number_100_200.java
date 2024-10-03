package test_prepration_for_30_sep_2024;

public class Print_all_palindrome_number_100_200 {

	public static void main(String[]args)
	{
		for(int i=100; i<=200; i++)
		{
			int ld =0;
			int n=i;
			int rev=0;
			
			while(n>0)
			{
				ld=n%10;
				n=n/10;
				rev=(rev*10)+ld;
			}
			if(i==rev)
			{
				System.out.println(i+" Palindrome Number");
			}
		}
	}
}
