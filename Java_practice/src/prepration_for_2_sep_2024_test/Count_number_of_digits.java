package prepration_for_2_sep_2024_test;

public class Count_number_of_digits {

	public static void main(String[]args)
	{
		int n=13623;
		int cnt =0;
		
		do
		{
			n=n/10;
			cnt++;
		}
		while(n>0);
		System.out.println(cnt);
	}
}
