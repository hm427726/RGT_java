package test_prepration_02_09_2024;

public class Find_prime_number_between_1_to_20 {

	public static void main(String[]args)
	{
		int n = 20;
		
		for(int i=1; i<=n; i++)
		{
			int cnt = 0;
			
			for(int k=1; k<=i; k++)
			{
				if(i%k==0)
				{
					cnt++;
				}
			}
			
			if(cnt==2)
			{
				System.out.println(i+" Prime Number");
			}
		}
	}
}
