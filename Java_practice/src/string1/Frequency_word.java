package string1;

public class Frequency_word {

	public static void main(String[]args)
	{
		String h= "   hassan mehdi student of regrow tech india hassan mehdi regrow ";
		h=h.trim();
		h= h.replaceAll("\\ + ", " ");
		
		String word []= h.split(" ");
		
		
	}
}
