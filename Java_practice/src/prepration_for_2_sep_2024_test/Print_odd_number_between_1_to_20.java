package prepration_for_2_sep_2024_test;

public class Print_odd_number_between_1_to_20 {

	public static void main(String[]args)
	{
		int n=1;
		int i =20;
		
		while(n<=i)
		{
			if(n%2==0)
			{
				n++;
				
				continue;
			}
			System.out.println(n);
			n++;
		}
	}
}
