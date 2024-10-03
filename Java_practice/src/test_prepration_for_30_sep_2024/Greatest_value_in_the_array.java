package test_prepration_for_30_sep_2024;

public class Greatest_value_in_the_array {

	public static void main(String[]args)
	{
		int arr[]= {1,2,4,5,6,7,10,8,9};
		int max=arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		
		System.out.println(max);
	}
}
