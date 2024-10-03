package test_prepration_15_sep_2024;

public class Print_even_number_present_in_the_array {

	public static void main(String[]args)
	{
		int arr[]= {2,4,6,7,8,9,6,5,3};
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}
