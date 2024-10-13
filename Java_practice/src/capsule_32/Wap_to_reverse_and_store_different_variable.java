package capsule_32;

public class Wap_to_reverse_and_store_different_variable {

	public static void main(String[]args)
	{
		String h= " hassan mehdi     is   student     of regrow    tech ";
		h=h.trim();
		h= h.replaceAll("\\s +", " ");
		
		char arr[]=h.toCharArray();
		
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]);
		}
	}
}
