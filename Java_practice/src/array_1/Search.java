package array_1;

public class Search {

	public static void main(String[]args)
	{
		int arr[]= {4,5,6,7,8,90,12,13,14,15,16,17,18,19,20};
		int search=15;
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
			System.out.println(" Found");
		}
		else
		{
			System.out.print(" Not_found");
		}
	}
}
