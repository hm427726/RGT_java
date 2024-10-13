package capsule_33;

public class Print_1st_letter_or_name_of_intial_letter {

	public static void main(String[]args)
	{
		String r= "Regrow Tech India";
		String word[]= r.split(" ");
		String store="";
		
		for(int i=0; i<word.length; i++)
		{
			char ch= word[i].charAt(0);
			store=store + ch+ ".";
		}
		
		
		System.out.println(store);
	}
}
