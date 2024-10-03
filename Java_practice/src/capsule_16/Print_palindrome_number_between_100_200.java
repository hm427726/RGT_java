package capsule_16;

public class Print_palindrome_number_between_100_200 {

	public static void main(String[]args)
	{
		int i = 1000;
		
		for(int n=100; n<=i; n++)
		{
			int j = n;
			int ld = 0;
			int rev = 0;
			
			while(j>0)
			{
				ld = j%10;
				j= j/10;
				rev = (rev*10)+ld;
			}
			
			if(n==rev)
			{
				System.out.println(n + " Palindrome Number");
			}
		}
	}
}
