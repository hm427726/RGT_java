package test_prepration_15_sep_2024;

public class Search_a_number_present_in_the_array {

	public static void main(String[]args)
	{
		int arr[]= {56,34,5,7,65,4,3,89,8};
		int search=65;
		boolean is_found=false;
		
		for(int i=0; i<arr.length; i++)
		{
			if(search==arr[i])
			{
				is_found=true;
				break;
			}
		}
		if(is_found==true)
		{
			System.out.println(search+" Found");
		}
		else
		{
			System.out.println(search+" Not Found");
		}
	}
}
