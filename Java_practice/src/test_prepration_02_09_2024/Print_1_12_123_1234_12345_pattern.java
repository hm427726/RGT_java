package test_prepration_02_09_2024;

public class Print_1_12_123_1234_12345_pattern {

	public static void main(String[]args)
	{
		int n =5;
		
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=r; c++)
			{
				System.out.print(c +" ");
			}
			System.out.println();
		}
	}
}
