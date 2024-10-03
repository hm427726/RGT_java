package test_prepration_for_30_sep_2024;

public class Print_all_even_number_in_the_array {

	public static void main(String[]args)
	{
		int arr[]= {6,5,4,4,3,3,5,6,7,7};
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
