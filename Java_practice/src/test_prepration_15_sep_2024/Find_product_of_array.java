package test_prepration_15_sep_2024;

public class Find_product_of_array {

	public static void main(String[]args)
	{
		int arr[]= {1,2,3,4,5};
		
		int pro=1;
		
		for(int i=0; i<arr.length; i++)
		{
			pro=pro*arr[i];
		}
		System.out.println(pro);
	}
}
