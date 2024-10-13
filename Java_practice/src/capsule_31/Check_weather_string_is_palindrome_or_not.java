package capsule_31;

public class Check_weather_string_is_palindrome_or_not {

	public static void main(String[]args)
	{
		String m="   madam ";
		m=m.trim();
		m= m.replaceAll("\\s+", " ");
		
		char ch[]=m.toCharArray();
		String rev="";
		
		for(int i=ch.length-1; i>=0; i--)
		{
			rev=rev+ch[i];
		}
		
		if(m.equals(rev))
		{
			System.out.println(" Palindrome");
		}
		else
		{
			System.out.println("Not A Palindrome");
		}
	}
}
