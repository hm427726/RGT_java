package capsule_24;

public class Search_a_number_present_in_array_or_not {

	public static void main(String[]args)
	{
		int arr[][]= {{23,54},{43,89},{2,4}};
		int search=83;
		boolean is_found=false;
		for(int r=0; r<arr.length; r++)
		{
			for(int c=0; c<arr[r].length; c++)
			{
				if(search==arr[r][c])
				{
					is_found=true;
				}
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
