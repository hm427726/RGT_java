package prepration_for_2_sep_2024_test;

public class Print_even_number_between_1_to_20_Using_Skip_concept {

	public static void main(String[]args)
	{
		int n=1;
		int i =20;
		
		while(n<=i)
		{
			if(n%2!=0)
			{
				n++;
				System.out.println(n);
				continue;
			}
			n++;
		}
	}
}
