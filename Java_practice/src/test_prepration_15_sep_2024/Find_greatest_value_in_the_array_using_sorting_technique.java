package test_prepration_15_sep_2024;

public class Find_greatest_value_in_the_array_using_sorting_technique {

	public static void main(String[]args)
	{
		int arr[]= {2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(arr[0]+" Minimum Value");
		System.out.println(arr[arr.length-1 ] +" Maximum Value");
	}
}
