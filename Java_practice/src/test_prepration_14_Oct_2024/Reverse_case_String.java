package test_prepration_14_Oct_2024;

public class Reverse_case_String {

	public static void main(String[]args)
	{
		String h= "Hassan Mehdi is StuDent of ReGrow TecH";
		h=h.trim();
		h=h.replaceAll("\\s+", " ");
		String str= "";
		
		for(int i=0; i<h.length(); i++)
		{
			char ch= h.charAt(i);
			if(Character.isUpperCase(ch))
			{
				ch= Character.toLowerCase(ch);
				str = str+ch;
			}
			else
			{
				ch= Character.toUpperCase(ch);
				str= str+ch;
			}
		}
		
		System.out.println(str);
	}
}
