package test_prepration_14_Oct_2024;

public class Count_number_of_character_in_String {

	public static void main(String[]args)
	{
		String h=" hassan mehdi";
		h=h.trim();
		h=h.replaceAll("\\s+", " ");
		int cnt=0;
		
		for(int i=0; i<h.length(); i++)
		{
			char ch=h.charAt(i);
			if(Character.isLetter(ch))
			{
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
