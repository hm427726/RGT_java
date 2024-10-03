package test_prepration_02_09_2024;

public class Find_the_special_number_between_1_to_100 {

	public static void main(String[]args)
	{
		int i= 200;
		
		for(int n1=100; n1<=i; n1++)
		{
			int ld = 0;
			int sum = 0;
			int n = n1;
			
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
			if(sum==n1)
			{
				System.out.println(n1 + " Special number");
			}
		}
	}
}
