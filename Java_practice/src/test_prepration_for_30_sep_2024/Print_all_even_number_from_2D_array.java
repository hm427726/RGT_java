package test_prepration_for_30_sep_2024;

public class Print_all_even_number_from_2D_array {

	public static void main(String[]args)
	{
		int arr[][]= {{2,3,4,5,6},{7,8,5,4,10}};
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(arr[i][j]%2==0)
				{
					System.out.print(arr[i][j]+" ");
				}
			} System.out.println();
		}
	}
}
