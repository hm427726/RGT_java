package capsule_23;

public class Find_the_minumum_value_in_the_array {

	public static void main(String[]args)
	{
		int arr[]= {6,3,4,5,3,2,1,4,6,65,7,54,3,6,46};
		int min=arr[0];
		
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.print(min);
	}
}
