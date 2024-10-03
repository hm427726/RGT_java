package test_prepration_for_30_sep_2024;

public class Print_all_element_in_2D_Array {

	public static void main(String[]args)
	{
		int arr[][]= {{2,3,4,5,6,7,8},{6,4,3,1,7,8,9}};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
