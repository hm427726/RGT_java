package test_prepration_02_09_2024;

public class Print_20_to_1_prime_number1 {

	public static void main(String[]args)
	{
		int n = 1;
		
		for(int i =20; i>=n; i--)
		{
			int cnt=0;
			
			for(int j=1; j<=i ; j++)
			{	
				if(i%j==0)
				{
					cnt++;
				}
			}
			if(cnt==2)
			{
				System.out.println(i+ " Prime number");
			}
		}
	}
}
