package capsule_35;

public class Extract_even_number_from_String {

	public static void main(String[]args)
	{
		String h= "1234hassan%^&56778";
		h=h.trim();
		h=h.replaceAll("\\s+ ", " ");
		
		for(int i=0; i<h.length(); i++)
		{
			char ch= h.charAt(i);
			if(Character.isDigit(ch))
			{
				int n= Character.getNumericValue(ch);
				
				if(n%2==0)
				{
					System.out.println(n);
				}
			}
		}
	}

}
