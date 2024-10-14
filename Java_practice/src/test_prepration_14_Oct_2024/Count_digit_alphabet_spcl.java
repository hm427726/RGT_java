package test_prepration_14_Oct_2024;

public class Count_digit_alphabet_spcl {

	public static void main(String[]args)
	{
		String h= "hassanmehdi@#$%^&4266";
		
		int digit_cnt=0; 
		int alpha_cnt=0;
		int spcl_cnt=0;
		
		String spcl="";
		String alpha="";
		String digit="";
		
		
		for(int i=0; i<h.length();i++)
		{
			char ch=h.charAt(i);
			
			if(Character.isDigit(ch))
			{
				digit_cnt++;
				digit=digit+ch;
			}
			else if(Character.isLetter(ch))
			{
				alpha_cnt++;
				alpha=alpha+ch;
			}
			else
			{
				spcl_cnt++;
				spcl=spcl+ch;
				
			}
		}
		System.out.println(spcl+"---> "+ spcl_cnt);
		System.out.println(digit+" ---->"+ digit_cnt);
		System.out.println(alpha+" -----> "+ alpha_cnt);
	}
}
