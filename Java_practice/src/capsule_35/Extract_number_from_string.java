package capsule_35;

public class Extract_number_from_string {

	public static void main(String[]args)
	{
		String h= "hassan1234mehdi5678";
		h=h.trim();
		h=h.replaceAll("\\s+", " ");
		String integer="";
		
		for(int i=0; i<h.length(); i++)
		{
			char ch= h.charAt(i);
			
			if(Character.isDigit(ch))
			{
				integer=integer+ch;
			}
		}
		System.out.println(integer);
	}
}
