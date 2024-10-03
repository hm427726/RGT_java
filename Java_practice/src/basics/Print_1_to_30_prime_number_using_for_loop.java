package basics;

public class Print_1_to_30_prime_number_using_for_loop {

	public static void main(String[]args)
	{
		int l = 30;
		
		for(int n = 1; n<=l; n++)
		{
			int cnt = 0;
			
			for(int i = 1; i<=n ; i++)
			{
				if(n%i==0)
				{
					cnt++;
				}
			}
			if(cnt == 2)
			{
				System.out.println(n + " Prime Number");
			}
		}
	}
}
