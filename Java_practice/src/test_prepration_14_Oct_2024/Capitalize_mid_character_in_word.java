package test_prepration_14_Oct_2024;

public class Capitalize_mid_character_in_word {

	public static void main(String[]args)
	{
//		String h="hassan mehdi is student of Regrow tech";
//		h=h.trim();
//		h=h.replaceAll("\\s+"," ");
//		h=h.toLowerCase();
//		String word[]=h.split(" ");
//		String str="";
//		
//		for(int i=0; i<word.length; i++)
//		{
//			int mid =word[i].length()/2;
//			char ch= word[i].charAt(mid);
//			char ch_up= Character.toUpperCase(ch);
//			String prefix = word[i].substring(0,mid);
//			String postfix = word[i].substring(mid+1);
//			str=str+prefix+ch_up+postfix+" ";	
//		}
//		System.out.println(str);
		
		String h= "I LOVE MY INDIA ";
		h=h.trim();
		String Vowels=h.replaceAll("[^AEIOUaeiou]","");
		System.out.print(Vowels);
	}	
}
