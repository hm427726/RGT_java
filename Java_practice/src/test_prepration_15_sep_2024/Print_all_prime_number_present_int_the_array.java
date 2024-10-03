package test_prepration_15_sep_2024;

public class Print_all_prime_number_present_int_the_array {

	public static void main(String[]args)
	{
		int arr[]= {2,3,4,5,6,7,8,9,10,13,15,17,19,22,23,29};
		
		for(int i=0; i<arr.length; i++)
		{
			int cnt=0;
			
			for(int j=1; j<=arr[i]; j++)
			{
				if(arr[i]%j==0)
				{
					cnt++;
				}
			}
			if(cnt==2)
			{
				System.out.println(arr[i]+" Prime Number");
			}
		}
	}
}
