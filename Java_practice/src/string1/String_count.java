package string1;

public class String_count {

	public static void main(String[]args)
	{
		String h = "hassan mehdi";
		char arr[]= h.toCharArray();
		int cnt=0;
		
		for(int i=0; i<arr.length; i++)
		{
			cnt++;
		}
		System.out.println(cnt);
	}
}
