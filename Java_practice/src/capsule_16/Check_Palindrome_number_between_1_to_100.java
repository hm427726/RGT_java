package capsule_16;

public class Check_Palindrome_number_between_1_to_100 {

	public static void main(String[]args)
	{
		int n = 200;
		
		for(int i = 100; i<=n; i++)
		{
			int j= i;
			int rev = 0;
			int ld = 0;
			
			while(j>0)
			{
				ld = j%10;
				j=j/10;
				rev =(rev*10)+ld;
			}
			if(i == rev)
			{
				System.out.println(i +" Palindrome_number");
			}
		}
	}
}
