package capsule_24;

public class Print_sum_of_element_in_2D_array {

	public static void main(String[]args)
	{
		int arr[][]= {{4,3},{9,8},{4,7},{23,43}};
		int sum=0;
		
		for(int r=0; r<arr.length; r++)
		{
			for(int c=0; c<arr[r].length; c++)
			{
				sum=sum+arr[r][c];
			}
		}
		System.out.println(sum);
	}
}
