package capsule_33;

public class Capitalize_the_1st_letter_of_each_word {

	public static void main(String[]args)
	{
		String h= " hassan   mehdi   is    Student   of   regrow   tech   and   learning    manual   testing    and  automation    testing ";
		h=h.trim();
		h=h.replaceAll("\\s+ ", " ");
		
		String word[]=h.split(" ");
		String str = "";
		for(int i=0; i<word.length; i++)
		{
			char f_val=word[i].charAt(0);
			char ch= Character.toUpperCase(f_val);
			str= str+ch+word[i].substring(1)+" ";
		}
		System.out.println(str);
	}
}
