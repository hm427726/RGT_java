package test_prepration_14_Oct_2024;

public class Count_word_in_the_string_using_array_method {

	public static void main(String[]args)
	{
		String h=" hassan mehdi is student of regrow tech";
		h=h.trim();
		h=h.replaceAll("\\s+", " ");
		char arr[]=h.toCharArray();
		int cnt=0;
		
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==' ')
			{
				cnt++;
			}
		}
		System.out.println(cnt+1+" Number of words ");
		
	}
}
