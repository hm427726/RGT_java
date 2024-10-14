package test_prepration_14_Oct_2024;

public class Find_the_intial_of_to_words {

	public static void main(String[]args)
	{
		String h="Hassan Mehdi";
		h=h.trim();
		h=h.replaceAll("\\s+"," ");
		String str="";
		String word[]=h.split(" ");
		
		for(int i=0; i<word.length-1; i++)
		{
			char ch= word[i].charAt(0);
			str = str+ch+".";
		}
		System.out.println(str+word[word.length-1]);
	}
}
