package function_test_prepration;

public class Palindrome_Number {

	public static void main(String[]args)
	{
		Palindrome_Number ob = new Palindrome_Number();
		int n=143;
		int rev_value= ob.reverse(n);
		ob.check(n,rev_value);
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
	
	public void check(int n, int rev_value)
	{
		if(n==rev_value)
		{
			System.out.println(n+" Palindrome_number");
		}
		else
		{
			System.out.println(n+" Not a plaindrome_number");
		}
	}
}
