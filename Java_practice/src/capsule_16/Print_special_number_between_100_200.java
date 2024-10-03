package capsule_16;

public class Print_special_number_between_100_200 {

	public static void main(String[]args)
	{
		int i = 200;
		
		for(int n = 100; n<=i; n++)
		{
			int j = n;
			int ld = 0;
			int sum = 0;
			
			while(j>0)
			{
				ld = j%10;
				j=j/10;
				
				int fact = 1;
				
				for(int k =1; k<=ld;k++)
				{
					fact = fact*k;
				}
				sum = sum +fact;
			}
			
			if(n==sum)
			{
				System.out.println(n + " Special Number");
			}
		}
	}
}
