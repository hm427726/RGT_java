package capsule_31;

public class Count_the_number_of_character_in_the_String {

	public static void main(String[]args)
	{
		String h="hassan mehdi";
		char arr[]= h.toCharArray();
		h=h.replaceAll("\\s+", "");
		int cnt=0;
		for(int i=0; i<arr.length; i++)
		{
			cnt++;
		}
		System.out.println(cnt);
		
	}
}
