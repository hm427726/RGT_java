package test_prepration_02_09_2024;

public class Pratice_pattern {

	public static void main(String[]args)
	{
		int n = 9;
		
		for(int r = 1; r<=n; n--)
		{
			for(int c = 1; c<=n-1+r ; c++)
			{
				System.out.print(n+ " * ");
			}
			System.out.println();
		}
	}
}
