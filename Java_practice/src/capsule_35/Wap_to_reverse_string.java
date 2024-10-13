package capsule_35;

public class Wap_to_reverse_string {

	public static void main(String[]args)
	{
		String h="Regrow Tech";
		h=h.trim();
		h=h.replaceAll("\\s+ " , " ");
		char arr[]=h.toCharArray();
		String str="";
		for(int i=arr.length-1;i>=0; i--)
		{
			str=str+arr[i];
		}
		
		System.out.println(str);
	}
}
