package capsule_34;

public class Case_rev {

	public static void main(String[]args)
	{
		String r = " ReGrow TecH InDia";
		r=r.trim();
		r=r.replaceAll("\\s+", " ");
		
		String str="";
		for(int i=0; i<r.length(); i++)
		{
			char ch = r.charAt(i);
			
			if(Character.isUpperCase(ch))
			{
				str= str+Character.toLowerCase(ch);
			}
			else
			{
				str=str+ Character.toUpperCase(ch);
			}
		}
		System.out.println(str);
	}
}
