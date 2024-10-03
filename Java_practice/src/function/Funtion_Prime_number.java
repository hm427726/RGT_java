package function;

public class Funtion_Prime_number {

	public static void PrimeNumber(int n)
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
			System.out.println(n+ " Prime Number");
		}
	}
	
	public static void main(String[]args)
	{
		for(int i=1; i<=100; i++)
		{
			Funtion_Prime_number.PrimeNumber(i);
		}
	}
}
