package capsule_31;

public class Count_word_in_string_using_array_method {

	public static void main(String[]args)
	{
		String h=" hi i am hassan mehdi and i am student of regrow tech";
		h=h.trim();
		h=h.replaceAll("\\s+ "," ");
		
		char word[]= h.toCharArray();
		int cnt=0;
		
		for(int i=0; i<word.length; i++)
		{
			if(word[i]==' ')
			{
				cnt++;
			}
		}
		System.out.println(cnt+1);
	}
}
