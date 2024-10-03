package capsule_23;

public class Find_the_3rd_highest_2nd_lowest_number {

	public static void main(String[]args)
	{
		int arr[]= {87,43,54,65,7,5,43,32,1,54};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("2nd_lowest_number" +arr[1]);
		System.out.println("3rd_highest_number"+ arr[arr.length-3]);
	}
}
