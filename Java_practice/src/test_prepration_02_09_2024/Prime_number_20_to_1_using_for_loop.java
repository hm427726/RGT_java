package test_prepration_02_09_2024;

public class Prime_number_20_to_1_using_for_loop {

	public static void main(String[]args)
	{
		int i = 1;;
		
		for(int n=20; n>=i; n-- )
		{
			int cnt = 0;
			
			for(int j = 1; j<=n; j++)
			{
				if(n%j==0)
				{
					cnt++;
				}
			}
			if(cnt==2)
			{
				System.out.println(n + " Prime number");
			}
		}
	}
}
