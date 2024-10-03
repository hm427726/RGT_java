package function;

public class Palindrome_Function {

	public static void main(String[] args) {
		Palindrome_Function ob = new Palindrome_Function();
		int n = 121;
		int rev_val = ob.reverse(n);
		ob.display(n,rev_val);
	}
	
	public int reverse(int n)
	{
		int ld;
		int rev =0;
		while(n>0)
		{
			ld = n%10;
			n = n/10;
			rev = (rev*10)+ld;
		}
		return rev;
	}
	public void display(int n,int rev)
	{
		if(n == rev)
		{
			System.out.println(n+" is a palindrome number");
		}
		else
		{
			System.out.println(n+" is not a palindrome number");
		}
	}

}
