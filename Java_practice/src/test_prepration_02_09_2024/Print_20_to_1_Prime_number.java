package test_prepration_02_09_2024;

public class Print_20_to_1_Prime_number {

	public static void main(String[]args)
	{
		for(int i=30; i>=1; i--)
		{
			int cnt =0;
			
			for(int n=1; n<=i; n++)
			{
				if(i%n==0)
				{
					cnt++;
				}
			}
			if(cnt==2)
			{
				System.out.println(i +" Prime number");
			}
		}
	}
}
