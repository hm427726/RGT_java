package test_prepration_15_sep_2024;

public class Print_all_even_number_in_the_array {

	public static void main(String[]args)
	{
		int arr[]= {2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
