package test_prepration_15_sep_2024;

public class Print_index_of_array {

	public static void main(String[]args)
	{
		int arr[]= {2,4,6,7,8,9,6,5,3};
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(arr.length+" ");
		System.out.println(arr[7]);
		System.out.println(arr[arr.length-1]);
	}
}
