package test_prepration_15_sep_2024;

public class Pattern_ {

	public static void main(String[]args)
	{
		int n=5;
		
		for(int r=1; r<=n; r++)
		{
			for(int s=1; s<=n-r+1; s++ )
			{
				System.out.print(" ");
			}
			
			for(int c=1; c<=r; c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
