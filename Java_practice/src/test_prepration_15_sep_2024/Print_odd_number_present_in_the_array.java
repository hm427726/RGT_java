package test_prepration_15_sep_2024;

public class Print_odd_number_present_in_the_array {

	public static void main(String[]args)
	{
		int arr[]= {7,4,3,6,7,3,7,5,4,6,9,8};
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}
