package capsule_24;

public class Print_odd_number_present_in_the_array {

	public static void main(String[]args)
	{
		int arr[][]= {{32,4},{3,6},{2,5,},{7,9}};
		
		for(int r=0; r<arr.length; r++)
		{
			for(int c=0; c<arr[r].length; c++)
			{
				if(arr[r][c]%2!=0)
				{
					System.out.print(arr[r][c]+ " ");
				}
			}
			System.out.println();
		}
	}
}
