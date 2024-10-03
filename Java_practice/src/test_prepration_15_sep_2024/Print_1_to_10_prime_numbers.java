package test_prepration_15_sep_2024;

public class Print_1_to_10_prime_numbers {

	public static void main(String[]args)
	{
		int n=1000;
	
		for(int i=1; i<=n; i++)
		{
			int cnt = 0;
			
			for(int c=1; c<=i; c++)
			{
				if(i%c==0)
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
