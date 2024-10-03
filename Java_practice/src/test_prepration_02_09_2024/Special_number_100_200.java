package test_prepration_02_09_2024;

public class Special_number_100_200 {

	public static void main(String[]args)
	{
		int l=200;
		
	for(int n =100; n<=l; n++)
	{
		int i = n;
		int ld = 0;
		int sum = 0;
		
		while(i>0)
		{
			ld=i%10;
			i=i/10;
			
			int fact = 1;
			
			for(int j=1; j<=ld;j++)
			{
				fact=fact*j;
			}
			sum=sum+fact;
		}
		if(n== sum)
		{
			System.out.println(n + " Special Number");
		}
	}
	
	}
}
