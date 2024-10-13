package string1;

public class Remove_extra_Space_ 
{

	public static void main(String[]args)
	{
		
		String h = "        hasssan        mehdi        is        student       of       regrow       tech       ";
		h = h.trim();
		h = h.replaceAll("\\ + "," ");
		
		System.out.println(h);
		
	}
}
