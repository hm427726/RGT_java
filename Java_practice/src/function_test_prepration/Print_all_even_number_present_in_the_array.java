package function_test_prepration;

public class Print_all_even_number_present_in_the_array {

	public static void even(int n)
	{
		if(n%2==0)
		{
			System.out.println(n);
		}
	}
	
	public static void main(String[]args)
	{
		int arr[]= {2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<arr.length; i++)
		{
			 Print_all_even_number_present_in_the_array.even(arr[i]);
		}
	}
}
