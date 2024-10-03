package capsule_23;

public class Print_min_mux_number_in_the_array {

	public static void main(String[]args)
	{
		int arr[]= {2,4,6,5,7,8,5,4,3,2,6,8};
		int min=arr[0];
		int max=arr[0];
		
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
