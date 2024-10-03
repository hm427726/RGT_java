package function1;

public class Print_all_prime_number_using_function {

	public static void prime_number(int n)
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
			System.out.println(n+" Prime Number");
		}
	}
	
	public static void main(String[]args)
	{
		for(int i=1; i<=100; i++)
		{
			Print_all_prime_number_using_function.prime_number(i);
		}
	}
}
