package test_prepration_15_sep_2024;

public class Check_prime_number_or_not {

	public static void main(String[]args)
	{
		int n=10;
		int cnt =0;
		
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				cnt++;
			}
		}
		if(cnt==2)
		{
			System.out.println(" Prime Number");
		}
		else
		{
			System.out.println(" Not a Prime Number");
		}
	}
}
