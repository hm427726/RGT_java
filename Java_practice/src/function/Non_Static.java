package function;

public class Non_Static {

	public static void main(String[]args)
	{
		Non_Static ob= new Non_Static();
		for(int i=1; i<=20; i++)
		{
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
	
	public void display(int cnt, int i)
	{
		if(cnt==2)
		{
			System.out.println(i+ " Prime Number");
		}
	}
}
