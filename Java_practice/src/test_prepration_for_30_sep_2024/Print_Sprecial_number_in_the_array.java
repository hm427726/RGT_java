package test_prepration_for_30_sep_2024;

public class Print_Sprecial_number_in_the_array {

	public static void main(String[]args)
	{
		int arr[]= {145,153,166,177};
		
		for(int i=0; i<arr.length; i++)
		{
			
			int n=arr[i];
			int ld;
			int sum=0;
			
			while(n>0)
			{
				ld=n%10;
				n=n/10;
				int fact=1;
				
				for(int j=1; j<=ld; j++)
				{
					fact=fact*j;
				}
				sum=sum+fact;
			}
			
			if(sum==arr[i])
			{
				System.out.println(arr[i]+" Special_number");
			}
		}
	}
}
