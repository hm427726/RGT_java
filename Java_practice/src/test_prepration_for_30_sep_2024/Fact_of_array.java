package test_prepration_for_30_sep_2024;

public class Fact_of_array {

	public static void main(String[]args)
	{
		int arr[][]= {{2,3,4,5},{5,3,4,2},{4,5,3,1}};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				int fact=1;
				
				for(int n=1; n<=arr[i][j]; n++)
				{
					fact=fact*n;
				}
				System.out.print(fact+" ");
			}
			System.out.println();
		}
	}
}
