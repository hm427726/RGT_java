package test_prepration_02_09_2024;

public class Print_1_topleft_bottom_right {

	public static void main(String[]args)
	{
		int i = 5;
		
		for(int r=1; r<=i; r++)
		{
			for(int c=1; c<=r;c++)
			{
				System.out.print("1 ");
			}
			System.out.println();
		}
	}
}
