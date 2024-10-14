package test_prepration_14_Oct_2024;

public class Count_space_present_in_the_string {

	public static void main(String[]args)
	{
		String h=" hassan mehdi is student of regrow tech";
		char arr[]=h.toCharArray();
		int cnt=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==' ')
			{
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
