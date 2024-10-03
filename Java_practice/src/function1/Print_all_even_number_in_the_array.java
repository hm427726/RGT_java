package function1;

public class Print_all_even_number_in_the_array {

	public static void main(String[]args)
	{
		int arr[][]= {{1,2,3,4},{23,24,26,27},{31,32,34,36}};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int c=1; c<arr[i].length; c++)
			{
				Print_1_to_100_even_number.even(arr[i][c]);
			}
		}
	}
}
