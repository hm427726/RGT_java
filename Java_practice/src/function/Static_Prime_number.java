package function;

public class Static_Prime_number {

	public static void main(String[]args)
	{
		for(int i=1; i<=20; i++)
		{
			Static_Prime_number.prime(i);
		}
	}
	
	public static void prime(int n)
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
			System.out.println(n+" Prime_Number");
		}
	}
}
