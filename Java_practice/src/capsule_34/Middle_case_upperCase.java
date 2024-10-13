package capsule_34;

public class Middle_case_upperCase {

	public static void main(String[]args)
	{
//		String h=" HASSAN MEHDI";
//		h=h.toLowerCase();
//		h=h.trim();
//		h=h.replaceAll("\\s+", " ");
//		String word[]= h.split(" ");
//		String str="";
//		
//		for(int i=0; i<word.length; i++)
//		{
//			int mid =word[i].length()/2;
//			String prefix = word[i].substring(0,mid);
//			char ch = word[i].charAt(mid);
//			char ch_up= Character.toUpperCase(ch);
//			String post_fix = word[i].substring(mid+1);
//			str= str+prefix+ch_up+post_fix+" ";
//		}
//		System.out.println(str);
		
		String h="HASSAN MEHDI IS THE STUDENT OF REGROW TECH INDIA ";
		h=h.trim();
		h= h.replaceAll("\\s+", " ");
		h=h.toLowerCase();
		String word[]=h.split(" ");
		String str=" ";
		
		for(int i=0; i<word.length; i++)
		{
			int mid = word[i].length()/2;
			String prefix = word[i].substring(0,mid);
			char ch = word[i].charAt(mid);
			char ch_up= Character.toUpperCase(ch);
			String postfix = word[i].substring(mid+1);
			str= str+prefix+ch_up+postfix+" ";
		}
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
	}
}
