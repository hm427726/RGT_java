package capsule_29;

public class Prime_number_for_each {

	public static void main(String[]args)
	{
		Prime_number_for_each ob = new Prime_number_for_each();
		int arr[]= {1,2,3,4,5,6,67,8,9};
		ob.prime(arr);
		
	}
	
	public void prime(int arr[])
	{
		for(int each_val: arr)
		{
			int cnt =0;
			
			for(int i=1; i<=each_val; i++)
			{
				if(each_val%i==0)
				{
					cnt++;
				}
				
			}
			
			if(cnt==2)
			{
				System.out.println(each_val+" Prime_Number");
			}
		}
	}
}
