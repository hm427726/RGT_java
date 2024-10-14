package test_prepration_14_Oct_2024;

public class Print_all_even_index_value {

	public static void main(String[]args)
	{
		String h="Hassan Mehdi";
		char arr[]= h.toCharArray();
		
		for(int i=0; i<arr.length; i++)
		{
			if(i%2==0)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
