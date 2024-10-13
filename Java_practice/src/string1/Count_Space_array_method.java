package string1;

public class Count_Space_array_method {

	public static void main(String[]args)
	{
		String h="hassan mehdi is student of regrow tech";
		char arr[]= h.toCharArray();
		int cnt =0;
		
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
