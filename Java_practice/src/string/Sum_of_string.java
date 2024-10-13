package string;

public class Sum_of_string {

	public static void main(String[]args)
	{
		String arr[]= {"2.5", "6.5","8.8", "10.9"};
		double sum = 0 ;
		
		for(int i=0;i<arr.length; i++)
		{
			double a= Double.parseDouble(arr[i]);
			sum= sum+a;
		}
		
		System.out.printf("%.2f%n",sum);
	}
}
 