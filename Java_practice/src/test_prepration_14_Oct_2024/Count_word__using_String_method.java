package test_prepration_14_Oct_2024;

public class Count_word__using_String_method {

	public static void main(String[]args)
	{
		String h="hassan mehdi is student of regrow tech";
		int cnt=0;
		
		for(int i=0; i<h.length(); i++)
		{
			char ch= h.charAt(i);
			
			if(ch==' ')
			{
				cnt++;
			}
		}
		System.out.println(cnt+1);
	}
}
