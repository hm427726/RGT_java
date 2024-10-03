package function;

public class Machines {

	public static void even(int n)
	{
		if(n%2==0)
		{
			System.out.println(n);
		}
	}
	
	
		
		
	
	public static void PrimeNumber(int n)
	{
		int cnt=0;
		
		for(int i=1; i<=n;i++)
		{
			if(n%i==0)
			{
				cnt++;
			}
		}
		if(cnt==2)
		{
			System.out.println(n+" Prime_number");
		}
	}
	
	}