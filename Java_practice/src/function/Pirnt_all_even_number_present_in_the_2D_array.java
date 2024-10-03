package function;

public class Pirnt_all_even_number_present_in_the_2D_array {
	
	public static void main(String[]args)
	{
		int arr[][]= {{1,2,4,6},{4,6,8,5},{45,67,56,44}};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int c=0; c<arr[i].length; c++)
			{
				Machines.even(arr[i][c]);
			}
		}
	}
}

	
