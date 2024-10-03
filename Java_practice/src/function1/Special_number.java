package function1;

public class Special_number {

	public static void main(String[]args)
	{
		int n=145;
		int n1=n;
		int ld=0;
		int sum=0;
		
		while(n1>0)
		{
			ld=n1%10;
			n1=n1/10;
			
			int fact=1;
			for(int i=1; i<=ld; i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
		}
		if(sum==n)
		{
			System.out.println(n+" Special Number");
		}
		else
		{
			System.out.println(n+ " Not a Special Number");
		}
	}
}
