package test_prepration_for_30_sep_2024;

public class Search_4_is_present_in_the_array_or_not {

	public static void main(String[]args)
	{
		int arr[]= {6,5,4,4,3,3,5,6,7,7};
			
		int search=8;
		boolean is_found= false;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==search)
			{
				is_found=true;
			}
		}
		
		if(is_found==true)
		{
			System.out.println(search+" Found");
		}
		else
		{
			System.out.println(search+" Not_Found");
		}
	}
}
