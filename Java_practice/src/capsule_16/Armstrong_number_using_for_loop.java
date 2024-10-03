package capsule_16;

public class Armstrong_number_using_for_loop {

	public static void main(String[]args)
	{
		int n = 153;
		int n1 = n ;
		int cnt = 0;
		int n2 = n;
		
		while(n>0)
		{
			n=n/10;
			cnt++;
		}
		
		int sum = 0;
		
		for(int ld = 0; n1>0; n1=n1/10)
		{
			ld = n1%10;
			
			int pow = 1;
			
			for(int i = 1; i<=cnt; i++)
			{
				pow =pow*ld;
			}
			sum = sum+pow;
		}
		System.out.println(sum);
		
		if(n2 == sum)
		{
			System.out.println(n2 + " is an Armstrong_Number");
		}
		else
		{
			System.out.println(n2 + " is not an Armstrong_Number");
		}
	}
}
