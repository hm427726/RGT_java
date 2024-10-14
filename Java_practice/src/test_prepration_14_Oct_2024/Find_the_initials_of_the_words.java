package test_prepration_14_Oct_2024;

public class Find_the_initials_of_the_words {

	public static void main(String[]args)
	{
		String h= "ReGrow Tech India";
		h=h.trim();
		h=h.replaceAll("\\s+", " ");
		String initials="";
		String word[]=h.split(" ");
		
		for(int i=0; i<word.length; i++)
		{
			char ch= word[i].charAt(0);
			initials= initials+ch+".";
		}
		
		System.out.println(initials);
	}
}
