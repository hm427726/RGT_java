package test_prepration_14_Oct_2024;

public class Count_Digit_In_the_String {

	public static void main(String[]args)
	{
		String h=" hassan mehdi12345679";
		h=h.trim();
		h=h.replaceAll("\\s+" , " ");
		int cnt=0;
		
		for(int i=0; i<h.length(); i++)
		{
			char ch= h.charAt(i);
			
			if(Character.isDigit(ch))
			{
				cnt++;
			}
		}
		
		System.out.println("No.of Digit :- "+cnt);
	}
}
