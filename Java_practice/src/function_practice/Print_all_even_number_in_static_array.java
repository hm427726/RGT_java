package function_practice;

public class Print_all_even_number_in_static_array {

	public static void main(String[]args)
	{
		int arr[]= {8,7,6,5,4,3,2,1};
		
		for(int i=0; i<arr.length; i++)
		{
			Even_number_between_1_to_100.even(arr[i]);
		}
	}
}
