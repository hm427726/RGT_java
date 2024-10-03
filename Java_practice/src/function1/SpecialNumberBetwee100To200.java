package function1;

public class SpecialNumberBetwee100To200 {

	public static void specialnumber(int n)
	{
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
			System.out.println(n+ " Special NUmber");
		}
	}
	
	public static void main(String[]args)
	{
		for(int i=100; i<=200; i++)
		{
			SpecialNumberBetwee100To200.specialnumber(i);
		}
	}
}
