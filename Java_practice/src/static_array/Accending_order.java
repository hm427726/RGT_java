package static_array;

public class Accending_order {

	public static void main(String[]args)
	{
//		int arr[]= {12,54,45,65,34,45,65,23,45};
//		
//		for(int i=0; i<arr.length;i++)
//		{
//			for(int j=i; j<arr.length; j++)
//			{
//				if(arr[i]>arr[j])
//				{
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]= temp;
//				}
//			}
//		}
//		
//		for(int i=0; i<arr.length; i++)
//		{
//			System.out.print(arr[i]+",");
//		}
		
		int arr[]= {9,8,7,5,6,4,3,2,5,7,4,32,64,56};
		
		for(int i =0; i<arr.length;i++)
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
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
