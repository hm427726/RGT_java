package capsule_31;

public class Usage_of_all_String_method {

	public static void main(String[]args)
	{
		String h=" hi i am hassan meHdi and i am Student of regrow tech";
		h=h.trim();
		h=h.replaceAll("\\s+ "," ");
		
		int length= h.length();
		System.out.println(length);
		
		String str=h.toUpperCase();
		System.out.println(str);
		
		String str1=h.toLowerCase();
		System.out.println(str1);
		
		h=h.replace("h","0");
		System.out.println(h);
		
		char ch=h.charAt(8);
		System.out.println(ch);
		
		String j[]=h.split("0");
		
		for(String each : j)
		{
			System.out.println(each);
		}
		
		String str3=h.substring(9,14);
		System.out.println(str3);
		
		int n= h.indexOf("0");
		System.out.println(n);
		
		int ld_i= h.lastIndexOf("0");
		System.out.println(ld_i);
		
		
		
	}
}
