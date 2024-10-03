package function;

public class Min_Max {

	public static void main(String[]args)
	{
		Min_Max ob = new Min_Max();
		int arr[]= {2,3,4,5,6,7,8,9,10};
		int max= ob.max(arr);
		int min =ob.min(arr);
		ob.display(max, min);
	}
	
	public int max(int arr[])
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		
		return max;
	}
	
	public int min (int arr[])
	{
		int min=arr[0];
		
		for(int i=1; i<arr.length; i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		return min;
	}
	
	public void display(int max, int min)
	{
		System.out.println(max+" MAXIMUM_VALUE");
		System.out.println(min + " MINIMUM_VALUE");
	}
}
