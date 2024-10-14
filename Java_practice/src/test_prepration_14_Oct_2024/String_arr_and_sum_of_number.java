package test_prepration_14_Oct_2024;

public class String_arr_and_sum_of_number {

	public static void main(String[]args)
	{
		String arr[]= {"25","20","12","10","13"};
		int sum=0;
		
		for(int i=0; i<arr.length; i++)
		{
			int n= Integer.parseInt(arr[i]);
			sum=sum+n;
		}
		System.out.println(sum);
	}
}
