package capsule_35;

public class Sum_of_number_in_string {

	public static void main(String[]args)
	{
		String h="12345678";
		h=h.trim();
		h=h.replaceAll("\\s+"," ");
		int sum=0;
		
		for(int i=0; i<h.length();i++)
		{
			char ch= h.charAt(i);
			
			if(Character.isDigit(ch))
			{
				int n= Character.getNumericValue(ch);
					sum=sum+n;
			}
		}
		System.out.println(sum);
	}
}
