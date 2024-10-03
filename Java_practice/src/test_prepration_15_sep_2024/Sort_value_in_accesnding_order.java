package test_prepration_15_sep_2024;

public class Sort_value_in_accesnding_order {

	public static void main(String[]args)
	{
		int arr[]= {9,8,7,6,6,5,5,4,3,2,2,1};
		
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
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
