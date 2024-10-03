package function_practice;

public class Print_all_even_number_present_in_the_2D_array {

	public static void even(int n)
	{
		if(n%2==0)
		{
			System.out.println(n);
		}
	}
	public static void main(String[]args)
	{
		int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int c=0; c<arr[i].length; c++)
			{
				even(arr[i][c]);
			}
		}
	}
}
