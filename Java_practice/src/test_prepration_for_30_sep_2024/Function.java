package test_prepration_for_30_sep_2024;

public class Function {

	public int check(int i,int arr[],int max,int min)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	
		if(arr[i]<min)
		{
			min=arr[i];
		}
		return max;
		
	}









}

