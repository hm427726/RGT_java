package function;

public class Static_returning {

	public static void main(String[]args)
	{
		for(int i=1; i<=20; i++)
		{
			int cnt=Static_returning.prime(i);
			Static_returning.display(cnt,i);
		}
	}
	
	public static int prime(int n)
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
	
	public static void display(int cnt, int n)
	{
		if(cnt==2)
		{
			System.out.println(n +" Prime Number");
		}
	}
}
