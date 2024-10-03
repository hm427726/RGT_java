package capsule_24;

public class Print_all_element_in_the_array {

	public static void main(String[]args)
	{
		int arr[][]={{8,3},{5,6},{7,4}};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
	}
}
