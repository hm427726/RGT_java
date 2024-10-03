package test_prepration_for_30_sep_2024;

public class Find_the_3rd_highest_value_in_the_array {

	public static void main(String[]args)
	{
		int arr[]= {6,5,4,8,9,4,3,13,3,2};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(arr[1]);
		System.out.println(arr[arr.length-3]);
	}
}
