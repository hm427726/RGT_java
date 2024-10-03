package test_prepration_15_sep_2024;

public class Print_1_to_10_even_number {

	public static void main(String[]args)
	{
		int s=1;
		int e=10;
		
		while (s<=e)
		{
			if(s%2==0)
			{
				System.out.println(s);
			}
			s++;
		}
	}
}
