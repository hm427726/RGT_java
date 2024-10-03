package capsule_17;

public class Print_1_2_2_3_3_3_top_left_to_bottom_left {

	public static void main(String[]args)
	{
		int n = 9;
		
		for(int r = 1; r<=n; r++)
		{
			for(int c=1; c<=r; c++)
			{
				System.out.print(r + " " );
			}
			System.out.println(); 
		}
	}
	
}
