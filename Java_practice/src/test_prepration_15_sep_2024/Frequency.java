package test_prepration_15_sep_2024;

public class Frequency {

	public static void main(String[]args)
	{
		int arr[]= {1,9,7,9,6,5,4,3,1,6,7,9,4,1};
		for(int i=0;i<arr.length;i++)
		{
			int cnt=1;
			if(arr[i]!=Integer.MAX_VALUE)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						cnt++;
						arr[j]=Integer.MAX_VALUE;
					}
				}
				System.out.println(arr[i]+"--->"+cnt);
			}
		}
		
	}
	}


