package capsule_31;

public class Count_Spaces_Using_Array_Method {

	public static void main(String[]args)
	{
		String h=" hi i am hassan mehdi and i am student of regrow tech";
		h=h.trim();
		h=h.replaceAll("\\s+ "," ");
		
		char arr[]=h.toCharArray();
		
		int space_cnt=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==' ')
			{
				space_cnt++;
			}
		}
		System.out.println("No. of space----> "+ space_cnt);
	}
}
