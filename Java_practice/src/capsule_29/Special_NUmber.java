package capsule_29;

public class Special_NUmber {

	public static void main(String[]args)
	{
		Special_NUmber ob = new Special_NUmber();
		int n=145;
		
		int sum=ob.Special(n);
		ob.display(n,sum);
		
	}
	
	public int Special(int n)
	{
		int ld=0;
		int sum=0;
		
		while(n>0)
		{
			ld=n%10;
			n=n/10;
			
			int fact=1;
			for(int i=1; i<=ld; i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
		}
		return sum;
	}
	
	public void display(int n, int sum )
	{
		if(n==sum)
		{
			System.out.println(n+" Special Number");
		}
		else
		{
			System.out.println(n+" Not a Special Number");
		}
	}
	
}
