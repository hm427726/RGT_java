package capsule_35;

public class Extract_vovel_from_string {

	public static void main(String[]args)
	{
		String h="Hassan Mehdi is Student of Regrow Tech";
		String vowels= h.replaceAll("[^AEIOUaeiou]", "");
		
		System.out.println(vowels);


		
			
	}
}
