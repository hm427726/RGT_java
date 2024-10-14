package test_prepration_14_Oct_2024;

public class Count_number_of_spaces_split_method {

	public static void main(String[]args)
	{
		String h=" hassan mehdi is student of regrow tech";
		h=h.trim();
		String space[]=h.split(" "); 
		
		System.out.println(space.length-1);
		
	}
}
