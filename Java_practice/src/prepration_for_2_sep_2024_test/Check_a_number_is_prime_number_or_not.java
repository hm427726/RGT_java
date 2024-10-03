package prepration_for_2_sep_2024_test;

public class Check_a_number_is_prime_number_or_not {

	public static void main(String[]args)
	{
		int i =20;
	
		for(int n1=1; n1<=i; n1++)
		{
			int cnt =0;
		
			for(int n=1; n<=n1; n++)
			{
				if(n1%n==0)
				{
					cnt++;
				}
			}
			
			if(cnt==2)
			{
				System.out.println(n1+" Prime Number");
			}
			
		}
			
	}
}
