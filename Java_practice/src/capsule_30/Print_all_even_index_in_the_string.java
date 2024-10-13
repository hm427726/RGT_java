package capsule_30;

public class Print_all_even_index_in_the_string {

	public static void main(String[]args)
	{
		String str= "hassan mehdi";
		char ch[]=str.toCharArray();
		
		for(int i=0; i<ch.length; i++)
		{
			if(i%2==0)
			{
				System.out.println(ch[i]);
			}
		}
		
	}
}
