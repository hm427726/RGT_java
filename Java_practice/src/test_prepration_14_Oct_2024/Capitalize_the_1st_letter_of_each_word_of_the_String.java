package test_prepration_14_Oct_2024;

public class Capitalize_the_1st_letter_of_each_word_of_the_String {

	public static void main(String[]args)
	{
		String h="md hassan mehdi is a student of regrow tech";
		h=h.trim();
		h=h.replaceAll("\\s+"," ");
		String word[]=h.split(" ");
		String str="";
		
		for(int i=0; i<word.length; i++)
		{
			char ch=word[i].charAt(0);
			ch=Character.toUpperCase(ch);
			str=str+ch+word[i].substring(1)+" ";
		}
		
		System.out.println(str);
	}
}
