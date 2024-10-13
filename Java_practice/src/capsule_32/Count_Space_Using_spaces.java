package capsule_32;

public class Count_Space_Using_spaces {

	public static void main(String[]args)
	{
		String h=" hi i am hassan mehdi and i am student of regrow tech";
		h=h.trim();
		h=h.replaceAll("\\s+ "," ");
		
		String space[]=h.split(" ");
		
		int cnt=0;
		for(int i=0; i<space.length; i++)
		{
			cnt++;
		}
		System.out.println(cnt-1);
	}
}
