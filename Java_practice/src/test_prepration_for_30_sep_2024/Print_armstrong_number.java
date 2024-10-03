package test_prepration_for_30_sep_2024;

public class Print_armstrong_number {

	public static void main(String[]args)
	{
		int arr[]= {145,153,234,24};
		
		for(int i=0; i<arr.length; i++)
		{
			int n=arr[i];
			int n1=arr[i];
			int cnt=0;
			int ld =0;
			int sum=0;
			
			while(n1>0)
			{
				n1=n1/10;
				cnt++;
			}
			
			while(n>0)
			{
				ld=n%10;
				n=n/10;
				int pow=1;
				
				for(int j=1; j<=cnt; j++)
				{
					pow=pow*ld;
				}
				sum=sum+pow;
			}
			
			if(sum==arr[i])
			{
				System.out.println(arr[i]+" Armstrong_Number");
			}
		}
	}
}
