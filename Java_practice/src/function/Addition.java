package function;

public class Addition {

	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		int c = 25;
//		int c = a+b;
		int value = add(a,b,c);
		System.out.println(value);
		double avg_value = average((double)value);
		System.out.printf("the average value is: %.2f\n",avg_value);
	}
	public static int add(int a,int b, int c)
	{
		int add = a+b+c;  //50
		return add;
	}
	public static double average(double val)
	{
		double avg = val / 3;
		return avg;

	}
	

}
