package test_prepration_14_Oct_2024;

public class Check_weather_palindrome_or_not {

	public static void main(String[]args)
	{
		String m= "madam";
		String rev="";
		
		for(int i=m.length()-1; i>=0; i--)
		{
			char ch= m.charAt(i);
			rev=rev+ch;
		}
		
		if(rev.equals(m))
		{
			System.out.println(rev+" Is_Palindrome");
		}
		else
		{
			System.out.println(rev+" Is_Not_Palindrome");
		}
	}
}
