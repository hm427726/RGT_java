package capsule_23;

public class Find_greatest_value_in_the_array_without_using_sorting_technique {

	public static void main(String[]args)
	{
		int arr[]= {5,7,8,9,6,4,3,2,1};
		int max =arr[0];
		
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}
