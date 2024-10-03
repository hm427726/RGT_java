package dynamic_array_pattern;

public class Print_arrayIndex_factorial {

	public static void main(String[]args)
	{
		int arr[][]= {{1,2,3,4},{1,2,3,5}};
		
		for(int r=0; r<arr.length; r++)
		{
			for(int c=0; c<arr[r].length; c++)
			{
				int fact=1;
				
				for(int i=1; i<=arr[r][c]; i++)
				{
					fact=fact*i;
				}
				System.out.print(fact+" ");
			}
			System.out.println();
		}
		
	}
}
