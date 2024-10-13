package string1;

public class Count_word {

	public static void main(String[]args)
	{
		String h=" We are Student of ReGrow Tech";
		char arr[]=h.toCharArray();
		int cnt=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==' ')
			{
				cnt++;
			}
		}
		
		System.out.println(cnt+1);
	}
}
