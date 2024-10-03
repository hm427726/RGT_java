package test_prepration_02_09_2024;

public class Print_topright_to_bottom_left {

	public static void main(String[]asrgs)
	{
		for(int i=5; i>=1; i--)
		{
			for(int n=1; n<=i;n++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
