package string1;

public class String_reverse {

	public static void main(String[]args)
	{
		String h="hassan mehdi";
		char arr[]=h.toCharArray();
		String ch ="";
		
		for(int i=arr.length-1; i>=0; i--)
		{
			ch= ch+arr[i];
		}
		
		if(ch.equals(h))
		{
			System.out.println(" Palindrome");
		}
		else
		{
			System.out.println(" Not a palindrome");
		}
	}
}
