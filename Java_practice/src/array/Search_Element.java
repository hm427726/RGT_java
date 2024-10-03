package array;

public class Search_Element {

	public static void main(String[] args) {
		int arr[]  = {5,12,5,8,19,12,13,14,2};
		int search_val = 119;
		boolean is_found = false;
		for(int i=0;i<arr.length;i++)
		{
			if(search_val==arr[i])
			{
				is_found = true;
			}
		}
		if(is_found == true)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}

	}

}
