package test_prepration_for_30_sep_2024;

public class Function_prime_number {

	public static void main(String[]args)
	{
		for(int i=0; i<=100; i++)
		{
			Function_prime_number ob = new Function_prime_number();
			int cnt= ob.prime(i);
			ob.display(cnt, i);
		}
	}
	
	public int prime(int n)
	{
		int cnt=0;
		
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				cnt++;
			}
		}
		return cnt;
	}
	
	public void display(int cnt,int n)
	{
		if(cnt==2)
		{
			System.out.println(n+" Prime Number");
		}
	}
}
