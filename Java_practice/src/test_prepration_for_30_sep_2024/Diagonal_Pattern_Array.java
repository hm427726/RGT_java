package test_prepration_for_30_sep_2024;

public class Diagonal_Pattern_Array {

	public static void main(String[]args)
	{
		int arr[][]= {{2,3,4,5},{5,43,3,5},{8,6,5,3},{4,5,7,6}};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i][j]+" ");
				}
			}System.out.println();
		}
	}
}
