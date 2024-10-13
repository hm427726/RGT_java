package capsule_30;

public class String_array_and_sum_of_all__number {

	public static void main(String[]args)
	{
		String arr[]= {"12", "13","14","15"};
		
		int sum=0;
		
		for(int i=0; i<arr.length; i++)
		{
			int n= Integer.parseInt(arr[i]);
			sum=sum+n;
		}
		System.out.println(sum);
	}
}
