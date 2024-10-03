package test_prepration_02_09_2024;

public class Print_odd_number_1_to_20_using_for_loop {

	public static void main(String[]args)
	{
		int n =20;
		
		for(int i = 1; i<=n; i++)
		{
			if(i%2!=0)
			{
				System.out.print(i + " ");
			}
		}
	}
}
