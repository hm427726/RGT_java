package test_prepration_for_30_sep_2024;

public class Sum_of_all_element_in_2D_Array {

	public static void main(String[]args)
	{
		int arr[][]= {{2,3,5,5,6},{4,6,5,0}};
		int sum=0;
		
		for(int i=0; i<arr.length; i++)
		{
			
			for(int j=0; j<arr[i].length; j++)
			{
				sum=sum+arr[i][j];
			}
		}
		System.out.println(sum);
		
	}
}
