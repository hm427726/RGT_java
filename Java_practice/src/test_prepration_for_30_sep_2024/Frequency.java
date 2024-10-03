package test_prepration_for_30_sep_2024;

public class Frequency {

	public static void main(String[]args)
	{
		int arr[]= {2,4,6,7,8,2,4,5,6,7};
		
		for(int i=0; i<arr.length; i++)
		{
			int cnt=1;
			
			if(arr[i]!=Integer.MAX_VALUE)
			{
				for(int j=i+1; j<arr.length; j++)
				{
					if(arr[i]==arr[j])
					{
						cnt++;
						arr[j]=Integer.MAX_VALUE;
					}
				}
				
				
				if(cnt<2)
				{
					System.out.println(arr[i]+" Not repeating");
				}
			}
		}
	}	
}
