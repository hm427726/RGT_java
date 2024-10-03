package test_prepration_for_30_sep_2024;

public class Search_a_number_present_in_the_array {

	public static void main(String[]args)
	{
		int arr[][]= {{2,3,4,5},{9,8,7,6},{45,49,50}};
		int search= 45;
		boolean is_found=false;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(search==arr[i][j])
				{
					is_found=true;
				}
			}
		}
		if(is_found==true)
		{
			System.out.println(search+" ----> "+ "Found");
		}
		else
		{
			System.out.println(search +" -----> "+" Not Found");
		}
	}
}
