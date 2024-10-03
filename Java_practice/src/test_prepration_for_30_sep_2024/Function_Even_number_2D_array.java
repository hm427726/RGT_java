package test_prepration_for_30_sep_2024;

public class Function_Even_number_2D_array {

	public static void main(String[]args)
	{
		int arr[][]= {{2,3,4,5},{6,7,8,9},{9,8,7,6}};
		
		Function_Even_number_2D_array ob= new Function_Even_number_2D_array();
		ob.even(arr);
		
	}
	
	public void even(int arr[][])
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(arr[i][j]%2==0)
				{
					System.out.println(arr[i][j]);
				}
			}
		}
	}
}
