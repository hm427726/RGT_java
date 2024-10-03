package test_prepration_15_sep_2024;

public class Print_max_value_not_using_Sorting_value {

	public static void main(String[]args)
	{
		int arr[]= {2,4,7,8,9,7,5,4};
		int max = arr[0];
		int min = arr[0];
		
		for(int i=1; i<arr.length; i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println(min+" Minmum_value");
		System.out.println(max+" Maximum_value");
	}
}
