package capsule_15;

public class Special_number_using_for_loop {

	public static void main(String[]args)
	{
		int ld = 0;
		int sum = 0;
		int n1 = 145;
		
		
		for( int n = n1; n>0;n = n/10 )
		{
			
			ld = n%10;
			
			
			int fact =1;
			
			for(int i = 1; i<=ld;i++)
			{
				fact = fact*i;
			}
			sum = sum + fact;
		}
		
		
		if (n1 == sum)
		{
			System.out.println(n1 + " Special Number");
		}
		else
		{
			System.out.println(n1 + " No a Special NUmber");
		}
	}
}
