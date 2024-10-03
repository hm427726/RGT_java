package function_practice;

public class Print_prime_number_1_to_100 {

	public static void Prime_Number(int n)
	{
		int cnt=0;
		
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				cnt++;
			}
		}
		
		if(cnt==2)
		{
			System.out.println(n +" Prime_number");
		}
	}
	public static void main(String[]args)
	{
		for(int i=1; i<=100; i++)
		{
			Print_prime_number_1_to_100.Prime_Number(i);
		}
	}
}
