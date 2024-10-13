package capsule_34;

public class Cnt_Alphabets_digit_spcl_character {

	public static void main(String[]args)
	{
//		String h="hassan@%&*1234";
//		h=h.trim();
//		h=h.replaceAll("\\s+"," ");
//		int alpha_cnt=0;
//		int digit_cnt=0;
//		int spcl_cnt=0;
//		String alpha="";
//		String digit="";
//		String spcl="";
//		
//		for(int i=0; i<h.length();i++)
//		{
//			char ch= h.charAt(i);
//			
//			if(Character.isDigit(ch))
//			{
//				digit_cnt++;
//				digit= digit+ch;
//			}
//			else if(Character.isLetter(ch))
//			{
//				alpha_cnt++;
//				alpha=alpha+ch;
//			}
//			else
//			{
//				spcl_cnt++;
//				spcl=spcl+ch;
//			}
//		}
//		
//		System.out.println(alpha+"----> "+ alpha_cnt);
//		System.out.println(digit+"----> "+digit_cnt);
//		System.out.println(spcl+" ----> "+ spcl_cnt);
		
		
		String h= "hassan mehdi -> is Studennt of regrow tech ---> batch 2024-june-24";
		h=h.trim();
		h=h.replaceAll("\\+s", " ");
		String alpha ="";
		int cnt_alpha=0;
		String digit="";
		int cnt_digit=0;
		String spcl="";
		int cnt_spcl=0;
		
		
		for(int i=0; i<h.length(); i++)
		{
			char ch= h.charAt(i);
			
			if(Character.isDigit(ch))
			{
				digit=digit+ch;
				cnt_digit++;
			}
			else if(Character.isLetter(ch))
			{
				alpha=alpha+ch;
				cnt_alpha++;
			}
			else
			{
				spcl=spcl+ch;
				cnt_spcl++;
			}
		}
		System.out.println(alpha+"----> "+cnt_alpha);
		System.out.println(digit+"---->"+cnt_digit);
		System.out.println(spcl+"----> "+cnt_spcl);
	}
}
