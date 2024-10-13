package capsule_31;

public class Reverse_a_String {

	public static void main(String[]args)
	{
		String h="hassan mehdi";
		h=h.trim();
		h=h.replaceAll("\\s+ ", " ");
		char ch[]= h.toCharArray();
		
		for(int i= ch.length-1; i>=0; i--)
		{
			System.out.println(ch[i]);
		}
	}
}
