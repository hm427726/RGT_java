package function1;

public class Prime_number_30_to_1_using_function {

	public static void primenumber(int n)
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
			System.out.println(n+" Prime_number");
		}
	}
	public static void main(String[]args)
	{
		for(int i=30; i>=1; i--)
		{
			Prime_number_30_to_1_using_function.primenumber(i);
		}
	}
}
