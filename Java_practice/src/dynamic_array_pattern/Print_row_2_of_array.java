package dynamic_array_pattern;

public class Print_row_2_of_array {

	public static void main(String[]args)
	{
		 int arr[][]= {{8,7,8,9},{4,8,6,7},{9,3,4,2},{2,1,3,4}};
		 
		 for(int r=1; r<arr.length-2; r++)
		 {
			 for(int c=0; c<arr[r].length; c++)
			 {
				 System.out.print(arr[r][c]);
			 }
			 System.out.println();
		 }
	}
}
