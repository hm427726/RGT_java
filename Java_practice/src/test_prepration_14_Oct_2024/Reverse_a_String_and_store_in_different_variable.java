package test_prepration_14_Oct_2024;

public class Reverse_a_String_and_store_in_different_variable {

	public static void main(String[]args)
	{
		String h="hassan mehdi Regrow tech";
		String rev="";
		
		for(int i=h.length()-1; i>=0; i--)
		{
			char ch=h.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
	}
}
