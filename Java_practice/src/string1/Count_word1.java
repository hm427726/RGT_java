package string1;

public class Count_word1 {

	public static void main(String[]args)
	{
		String h= "we are Student of ReGrow Tech";
		h=h.trim();
		String word []= h.split(" ");
		
		System.out.println(word.length);
	}
}
