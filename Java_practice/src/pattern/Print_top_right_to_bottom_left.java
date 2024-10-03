package pattern;

public class Print_top_right_to_bottom_left {

	public static void main(String[]args)
	{
		int n =5;
		
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n-r+1; c++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
