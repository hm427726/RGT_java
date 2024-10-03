package function_test_prepration;

public class Print_all_Prime_number {

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
	
	public static void main(String[]args)
	{
		for(int i=1; i<=100; i++)
		{
			Print_all_Prime_number.prime(i);
		}
	}
}
