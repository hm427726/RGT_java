package test_prepration_02_09_2024;

public class Print_top_left_to_bottom_right {

	public static void main(String[]args)
	{
		int n=4;
		
		int cnt=0;
		
		for(int r=1; r<=n; r++ )
		{
		
			
			for(int c=1; c<=r; c++)
			{
				cnt++;
				System.out.print(cnt +" ");
			}
			System.out.println();
		}
	}
}
