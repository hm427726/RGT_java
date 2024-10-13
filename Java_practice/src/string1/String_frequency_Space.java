package string1;

public class String_frequency_Space {

	public static void main(String[]args)
	{
		String h= "     hassan mehdi student   of   regrow tech   ";
		h=h.trim();
		h= h.replaceAll("\\ + ", " ");
		
		char arr[]= h.toCharArray();
		int cnt=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==' ')
			{
				cnt++;
			}
		}
		System.out.println(cnt-1);
	}
}
