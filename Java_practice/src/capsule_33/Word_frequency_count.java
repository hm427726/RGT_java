package capsule_33;

public class Word_frequency_count {

	public static void main(String[]args)
	{
		String h=" hassan  mehdi   is student of regrow tech hassan mehdi is regrow tech";
		h=h.trim();
		h=h.replaceAll("\\s+ "," ");
		
		String word[]=h.split(" ");
		
		for(int i=0; i<word.length; i++)
		{
			int cnt=1;
			
			if(!word[i].equals("^%*"))
			{
				for(int j=i+1; j<word.length; j++)
				{
					if(word[i].equals(word[j]))
					{
						cnt++;
						word[j]="^%*";
					}
				}
				System.out.println(word[i]+" ----> "+ cnt);
			}
		}
	}
}
