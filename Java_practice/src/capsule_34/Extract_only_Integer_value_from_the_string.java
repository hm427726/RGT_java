package capsule_34;

public class Extract_only_Integer_value_from_the_string {

	public static void main(String[]args)
	{
		String h=" hassan 12345 &%$^%^";
		h=h.trim();
		h=h.replaceAll("\\s+", " ");
		String digit="";
		
		for(int i=0; i<h.length(); i++)
		{
			char ch= h.charAt(i);
			if(Character.isDigit(ch))
			{
				digit=digit+ch;
			}
		}
		System.out.println(digit);
	}
}
