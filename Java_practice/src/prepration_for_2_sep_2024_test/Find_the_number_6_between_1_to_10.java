package prepration_for_2_sep_2024_test;

public class Find_the_number_6_between_1_to_10 {

	public static void main(String[]args)
	{
		int n =1;
		int i = 10;
		int search =6;
		
		while(n<=i)
		{
			if(search==n)
			{
				System.out.println(n);
				break;
			}
			n++;
		}
	}
}
