package capsule_30;

public class Convert_String_to_char {

	public static void main(String[]args)
	{
//		String str="hassan mehdi";
//		
//		char ch[]= str.toCharArray();
//		
//		for(int i=0; i<ch.length; i++)
//		{
//			System.out.println(ch[i]);
//		}
		
		String str="hassan mehdi";
		
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			
			System.out.println(ch);
		}
	}
}
