package array;

public class Ar_2D_array {

	public static void main(String[]args)
	{
		int arr[][]= {{3,2},{4,1},{5,9}};
		
		for(int r=0; r<arr.length; r++)
		{
			for(int c=0; c<arr[r].length;c++)
			{
//				System.out.println(arr[r][c]);
				 System.out.print(arr[r][c]+ " ");
			}
			System.out.println();
		}
	}
}
