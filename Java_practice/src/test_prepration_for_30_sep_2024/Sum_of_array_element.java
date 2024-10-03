package test_prepration_for_30_sep_2024;

public class Sum_of_array_element {

	public static void main(String[]args)
	{
		int arr[]= {2,8,5,4,3,21,20,20,40,10,10,2,5,3};
		int sum=0;
		
		for(int i=0;i<arr.length; i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
}
