package test_prepration_15_sep_2024;

public class Print_special_number_between_100_to_200 {

	public static void main(String[]args)
	{
		for(int n=100; n<=200; n++)
		{
			int n1=n;
			int ld =0;
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
			if(n==sum)
			{
				System.out.println(n+" Special Number");
			}
		}
	}
}
