package capsule_35;

public class Extract_spcl_character_from_String {

	public static void main(String[]args)
	{
		String h="1234@%hassan%^&&5678";
		h=h.trim();
		h=h.replaceAll("\\s+", " ");
		String spcl_ch="";
		for(int i=0; i<h.length(); i++)
		{
			char ch= h.charAt(i);
			
			if(!Character.isWhitespace(ch) && !Character.isDigit(ch) && !Character.isAlphabetic(ch))
			{
				spcl_ch=spcl_ch+ch;
			}
		}
		System.out.println(spcl_ch);
	}
}
