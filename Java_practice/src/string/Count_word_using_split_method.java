package string;

public class Count_word_using_split_method {

	public static void main(String[]args)
	{
		String h="We are student of ReGrow Tech";
		String word []= h.split(" ");
		
		for(String each_val : word)
		{
			System.out.println(each_val);
		}
	}
}
