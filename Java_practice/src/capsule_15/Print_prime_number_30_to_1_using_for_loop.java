package capsule_15;

public class Print_prime_number_30_to_1_using_for_loop {

	public static void main(String[]args)
	{
		int l = 1;
		
		for(int n = 30; n>=l; n--)
		{
			int cnt = 0;
			for(int i=1; n>=i; i++ )
			{
				if(n%i==0)
				{
					cnt++;
				}
			}
			
			if(cnt == 2)
			{
				System.out.println(n + " Prime number");
			}
		}
	}
}
