package test_prepration_for_30_sep_2024;

public class Special_number_100_200 {

	public static void main(String[]args)
	{
		for(int i=100; i<=200; i++)
		{
			int ld=0;
			int n=i;
			int sum =0;
			while(n>0)
			{
				ld=n%10;
				n=n/10;
				int fact=1;
				
				for(int j=1; j<=ld; j++)
				{
					fact=fact*j;
				}
				sum=sum+fact;
			}
			if(i==sum)
			{
				System.out.println(i+" Special Number");
			}
		}
	}
}
