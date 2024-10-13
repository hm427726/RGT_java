package capsule_31;

public class Count_space_using_string_method {

	public static void main(String[]args)
	{
		String h=" hi i am hassan mehdi and i am student of regrow tech";
		h=h.trim();
		h=h.replaceAll("\\s+ "," ");
		
		int cnt =0;
		
		for(int i=0; i<h.length(); i++)
		{
			char ch= h.charAt(i);
			
			if(ch==' ')
			{
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
