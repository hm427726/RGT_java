package test_prepration_15_sep_2024;

public class Print_sum_of_2d_array {

	public static void main(String[]args)
	{
		int arr[][]= { {2,3,4,5},{6,4,3,2} } ;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int c=0; c<arr[i].length; c++)
			{
				System.out.print(arr[i][c]);
			}
			System.out.println();
		}
	}
}
