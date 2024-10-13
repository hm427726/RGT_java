package string1;

public class Sum_of_string {

	public static void main(String[]args)
	{
		String arr[]= {"20.5", "4.5", "6.7","21."};
		double sum=0;
		
		for(int i=0; i<arr.length; i++)
		{
			double d= Double.parseDouble(arr[i]);
			sum = sum+d;
		}
		System.out.println(sum);
	}
}
