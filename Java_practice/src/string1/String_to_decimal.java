package string1;

public class String_to_decimal {

	public static void main(String[]args)
	{
		String str= "20.5";
		String str2 = " 25.5";
		
		double a = Double.valueOf(str);
		double b = Double.valueOf(str2);
		
		System.out.println(a+b);
	}
}
