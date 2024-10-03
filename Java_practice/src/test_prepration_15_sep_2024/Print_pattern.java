package test_prepration_15_sep_2024;

public class Print_pattern {

	public static void main(String[]args)
	{
		int n=5;
		
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n-r+1; c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=2; i<=n; i++)
		{
			for(int s=1; s<=i; s++)
			{
				System.out.print("* ");
			}	
			System.out.println();
		}
	}
}
