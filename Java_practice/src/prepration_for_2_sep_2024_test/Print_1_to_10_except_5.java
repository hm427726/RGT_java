package prepration_for_2_sep_2024_test;

public class Print_1_to_10_except_5 {

	public static void main(String[]args)
	{
		int n = 1;
		int i =10;
		int search = 5;
		
		while(n<=i)
		{
			if(search == n)
			{
				n++;
				continue;
			}
			System.out.println(n);
			n++;
		}
	}
}
