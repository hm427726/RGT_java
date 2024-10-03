package test_prepration_for_30_sep_2024;

public class Pattern {

	public static void main(String[]args)
	{
		int n=3;
		
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n-r+1; c++)
			{
				System.out.print(" ");
			}
			System.out.println("* ");
		}
		
		for(int r1=1; r1<=n; r1++)
		{
			for(int c2=1; c2<=r1; c2++)
			{
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for(int r1=1; r1<=n; r1++)
		{
			for(int c2=1; c2<=r1; c2++)
			{
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n-r+1; c++)
			{
				System.out.print(" ");
			}
			System.out.println("* ");
		}
	}
}
