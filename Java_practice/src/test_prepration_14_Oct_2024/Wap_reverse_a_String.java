package test_prepration_14_Oct_2024;

public class Wap_reverse_a_String {

	public static void main(String[]args)
	{
		String h="hassan mehdi";
		char arr[]=h.toCharArray();
		
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]);
		}
	}
}
