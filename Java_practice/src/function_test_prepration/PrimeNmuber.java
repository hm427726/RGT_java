package function_test_prepration;

public class PrimeNmuber {

	public static void main(String[]args)
	{
		for(int i=1; i<=10; i++)
		{
			PrimeNmuber ob= new PrimeNmuber();
			
			int cnt= ob.Prime(i);
			ob.check(cnt,i);
		}
	}
	
	public int Prime(int n)
	{
		int cnt =0;
		
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				cnt++;
			}
		}
		return cnt;
	}
	
	public void check(int cnt,int i)
	{
		if(cnt==2)
		{
			System.out.println(i+" Prime_number");
		}
	}
}
