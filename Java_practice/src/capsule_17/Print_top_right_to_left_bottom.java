package capsule_17;

public class Print_top_right_to_left_bottom {

	public static void main(String[]args)
	{
		int n = 5;
		
		for(int r =1; r<=n; n--)
		{
			for(int c = 1; c<=n-1+r; c++ )
			{
				System.out.print(c +" ");
			}
			System.out.println();
		}
	}
}
