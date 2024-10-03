package test_prepration_02_09_2024;

public class Armstrong_number {

	public static void main(String[]args)
	{
		for(int n1 =100; n1<=200; n1++)
		{
			int n2 = n1;
			int n = n1;
			int cnt =0;
			
			while(n2>0)
			{
				n2=n2/10;
				cnt++;
			}
			
			int ld = 0;
			int sum = 0;
			
			while(n>0)
			{
				ld=n%10;
				n=n/10;
				
				int fact= 1;
				
				for(int j=1; j<=cnt; j++)
				{
					fact=fact*ld;
				}
				sum=sum+fact;
			}
			if(sum==n1)
			{
				System.out.println(n1+" Armstrong Number");
			}
		}
	}
}
