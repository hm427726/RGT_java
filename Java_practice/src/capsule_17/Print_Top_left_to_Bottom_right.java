package capsule_17;

public class Print_Top_left_to_Bottom_right {

	public static void main(String[]args)
	{
		int n =5;
		
		for(int r =1; r<=n; r++)
		{
			for(int c = 1; c<=r; c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
