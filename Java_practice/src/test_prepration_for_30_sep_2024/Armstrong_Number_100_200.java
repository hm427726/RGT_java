package test_prepration_for_30_sep_2024;

public class Armstrong_Number_100_200 {

	public static void main(String[]args)
	{
		for(int i=100; i<=200; i++)
		{
			int n=i;
			int n1=i;
			int cnt=0;
			
			while(n>0)
			{
				n=n/10;
				cnt++;
			}
			
			int ld=0;
			int sum=0;
			
			while(n1>0)
			{
				ld=n1%10;
				n1=n1/10;
				int pow=1;
				
				for(int j=1; j<=cnt; j++)
				{
					pow=pow*ld;
				}
				sum=sum+pow;
			}
			
			if(i==sum)
			{
				System.out.println(i+" Armstrong Number");
			}
		}
	}
}
