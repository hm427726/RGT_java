package string;

public class Print_even_no_of_index_String {

	public static void main(String[]args)
	{
		String h="Hassan Mehdi";
		char arr[]=h.toCharArray();
		
		for(int i=0; i<arr.length; i++)
		{
			if(i%2==0)
			{
				System.out.print(arr[i]+" | ");
			}
		}
	}
}
