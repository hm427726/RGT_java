package function_test_prepration;

public class Palindrome {

	public static void main(String[]args)
	{
		Palindrome ob= new Palindrome();
		for(int i=100; i<=200; i++)
		{
			int rev_value=ob.reverse(i);
			ob.check( i, rev_value);
		}
		
	}
	
	public int reverse(int n)
	{
		int ld=0;
		int rev=0;
		
		while(n>0)
		{
			ld=n%10;
			n=n/10;
			rev=(rev*10)+ld;
		}
		
		return rev;
		
	}
	
	public void check (int n, int rev_value)
	{
		if(n==rev_value)
		{
			System.out.println(n+" Palindrome_Number");
		}
	}
}
