package capsule_16;

public class Armstrong_number_Using_for_loop_ {

	public static void main(String[]args)
	{
		int i = 200;
		
		for (int n = 100; n<=i;n++)
		{
			int j = n;
			int cnt = 0;
			int sum = 0;
			int j1 = n;
			while(j>0)
			{
				j=j/10;
				cnt++;
			}
			
			
			for( int ld =0; j1>0; j1=j1/10)
			{
				
				ld=j1%10;
				
				int pow =1;
				for(int k =1; k<=cnt; k++)
				{
					pow=pow*ld;
				}
				sum=sum+pow;
			}
			if(n==sum)
			{
				System.out.println(n + " is an Armstrong Number");
			}
		}
	}
}
