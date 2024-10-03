package capsule_23;

public class Arrange_array_in_decending_order {

	public static void main(String[]args)
	{
		int arr[]= {23,24,2,4,6,7,89,9,67,54,23};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr.length; j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i] + " ");
		}
	}
}
