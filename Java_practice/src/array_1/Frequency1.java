package array_1;

public class Frequency1 {

	public static void main(String[]args)
	{
		int arr[]= {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,6};
		
		for(int i=0; i<arr.length; i++)
		{
			int cnt=1;
			
			if(arr[i]!= Integer.MAX_VALUE)
			{
				for(int j=i+1; j<arr.length; j++)
				{
					if(arr[i]==arr[j])
					{
						cnt++;
						arr[j]= Integer.MAX_VALUE;
						System.out.println(arr[i]+"----->"+ cnt);
					}
				}
				
			}
		}
	}
}
