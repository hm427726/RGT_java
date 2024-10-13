package capsule_35;

public class Reverse_a_String_in_OG_position {

	public static void main(String[]args)
	{
		String h="Regrow Tech";
		h=h.trim();
		h=h.replaceAll("\\s+", " ");
		String word[]=h.split(" ");
		String val="";
		
		
		for(int i=0; i<word.length; i++)
		{
			String rev ="";
			for(int j=word[i].length()-1; j>=0; j--)
			{
				rev=rev+word[i].charAt(j);
			}
			val=val+rev+" ";
		}
		System.out.println(val);
			
		
		
	

	
	}
}
