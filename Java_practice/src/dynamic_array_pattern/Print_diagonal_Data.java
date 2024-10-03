package dynamic_array_pattern;

public class Print_diagonal_Data {

	public static void main(String[]args)
	{
		int arr[][]= {{3,4,5,6},{2,4,6,8},{3,5,7,9},{5,3,1,7}};
		
		for(int r=0; r<arr.length; r++)
		{
			for(int c=0; c<arr[r].length; c++)
			{
				if(arr[r]==arr[c])
				{
					System.out.print(arr[r][c]);
				}
			}
			System.out.println();
		}
	}
}
