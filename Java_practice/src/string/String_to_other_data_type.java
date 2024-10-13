package string;

public class String_to_other_data_type {

	public static void main(String[]args)
	{
		String str= "10.5";
		String str2= " 15.5";
		
		System.out.println(str+str2);
		
//		double a = Double.parseDouble(str);
//		double b = Double.parseDouble(str1);
//		
//		double a = Double.parseDouble(str);
//		double b = Double.parseDouble(str2);
//		
//		double a = Double.parseDouble(str);
//		double b = Double.parseDouble(str2);
		
		double a = Double.parseDouble(str);
		double b = Double.parseDouble(str2);
		
		System.out.println(a+b);
	}
}
