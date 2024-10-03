package test_prepration_15_sep_2024;

public class Armstrong_number_between_100_to200 {

	public static void main(String[]args)
	{
		
	for(int n=100;  n<=200; n++)
	{
		int n1=n;
		int n2=n;
		int cnt=0;
		
		while(n1>0)
		{
			n1=n1/10;
			cnt++;
		}
		
		int ld=0;
		int sum=0;
		
		while(n2>0)
		{
			ld=n2%10;
			n2=n2/10;
			int pow=1;
			
			for(int i=1; i<=cnt; i++)
			{
				pow=pow*ld;
			}
			sum=sum+pow;
		}
		if(sum==n)
		{
			System.out.println(n+" Armstrong Number");
		}
	}
	}
}