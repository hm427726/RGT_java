package test_prepration_02_09_2024;

public class Special_number_between_100_200 {

	public static void main(String[]args)
	{
		int n = 200;
		
		for(int i = 100; i<=n; i++)
		{
			int i1=i;
			int ld =0;
			int sum = 0;
			
			while(i1>0)
			{
				ld=i1%10;
				i1=i1/10;
				int fact= 1;
				
				for(int j=1; j<=ld; j++)
				{
					fact=fact*j;
				}
				sum=sum+fact;
			}
			if(sum==i)
			{
				System.out.println(i +" Special number");
			}
		}
	}
}
