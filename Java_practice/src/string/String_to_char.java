package string;

public class String_to_char {

	public static void main(String[]args)
	{
		String s = "Sweety Xaxa";
		char arr[]= s.toCharArray();
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" | ");
		}
	}
}
