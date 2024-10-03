package test_prepration_for_30_sep_2024;

public class Function_print_array {

	public static void main(String[]args)
	{
		int arr[] = {2,4,5,6,7,8,9};
		Function_print_array.arr(arr);
	}
	public static void arr(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
