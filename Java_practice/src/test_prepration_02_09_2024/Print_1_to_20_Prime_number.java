package test_prepration_02_09_2024;

public class Print_1_to_20_Prime_number {

	public static void main(String[]args)
	{
		int n = 20;
		
		for(int i = 1; i<=n; i++)
		{
			int cnt = 0;
			
			for(int j=1; j<=i;j++)
			{
				if(i%j==0)
				{
					cnt++;
				}
			}
			if(cnt==2)
			{
				System.out.println(i+" Prime Number");
			}
			
		}
	}
}
