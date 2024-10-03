package static_array;

public class Search_9 {

	public static void main(String[]args)
	{
		int arr[]= {2,3,4,6,8,9,10};
		int search=13;
		boolean is_found=false;
		
		for(int i=0; i<arr.length; i++)
		{
			if(search==arr[i])
			{
				is_found=true;
				System.out.print(arr[i]);
			}
		}
		
		if(is_found==true)
		{
			System.out.print(" Found");
		}
		else
		{
			System.out.print(search +" Not Found");
		}
	}
}
