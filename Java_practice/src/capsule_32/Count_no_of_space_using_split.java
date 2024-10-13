package capsule_32;

public class Count_no_of_space_using_split {

	public static void main(String[]args)
	{
		String h="hassan mehdi is student of regrow tech";
		h=h.trim();
		h=h.replaceAll("\\s+ "," ");
		
		String word[]=h.split(" ");
		int space_cnt =0;
		
		for(int i=0; i<word.length; i++)
		{
			space_cnt++;
		}
		
		System.out.println(space_cnt-1);
	}
}
