package capsule_16;

public class Palindrome_number_100_200 {

	public static void main(String[]args)
	{
		int i = 200;
		
		for(int n = 100; n<=i; n++)
		{
			int n1= n;
			int ld = 0;
			int rev = 0;
			
			while(n1>0)
			{
				ld = n1%10;
				n1=n1/10;
				rev =(rev*10)+ld;
			}
			if(n==rev)
			{
				System.out.println(n + "Palindrome Number");
			}
		}
	}
}
