package capsule_17;

public class Print_1_12_123_12344_12345_top_left_to_bottom_right {

	public static void main(String[]args)
	{
		int n = 5;
		
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=r; c++)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}
