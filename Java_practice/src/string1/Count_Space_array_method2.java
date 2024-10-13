package string1;

public class Count_Space_array_method2 {

	public static void main(String[]args)
	{
		String h= "    hassan Mehdi is student of regrow tech    ";
		h= h.trim();
		
		System.out.println(h);
		
		char arr[]=h.toCharArray();
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
