package pattern;

public class Print_pattern_top_left_to_bottom_right {

	public static void main(String[]args)
	{
		
		
//		int n = 5;
//		
//		for(int r=1; r<=n; r++)
//		{
//			for(int c=1; c<=r; c++)
//			{
//				System.out.print(" * ");
//			}
//			System.out.println();
//		}
		
//	2.	Print_top_left_to_bottom_1_22_333_4444_555;
		
//		int n=5;
//		
//		for(int r=1; r<=n; r++)
//		{
//			for(int c=1; c<=r; c++)
//			{
//				System.out.print(r +" ");
//			}
//			System.out.println();
//		}
		
//	3. Print_top_right_to_bottom_left 55555_4444_333_22_1;
		
//		int n=5;
//		
//		for(int r=1; r<=5; r++)
//		{
//			for(int c=1; c<=n-r+1; c++)
//			{
//				System.out.print(n-r+1 + " ");
//			}
//			System.out.println();
//		}
		
//	4. Print_top_left_to_bottom_right_1_12_123_1234_12345;
		
//		int n =5;
//		
//		for(int r=1; r<=n; r++)
//		{
//			for(int c=1; c<=r; c++)
//			{
//				System.out.print(c +" ");
//			}
//			System.out.println();
//		}
		
//	5. Print_top_left_to_bottom_right_1_2_3_4_5_6_7_8_9_10;
			
//		int n=4;
//		int cnt=1;
//		
//		for(int r=1; r<=n; r++)
//		{
//			
//			for(int c=1; c<=r; c++)
//			{
//				System.out.print(cnt +" ");
//				cnt++;
//			}
//			System.out.println();
//		}
		
//	6. Print_top_left_to_bottom_right 5_54_543_5432_54321_;
		
//		int n=5;
//		
//		for(int r=1; r<=n; r++)
//		{
//			for(int c=1; c<=r; c++)
//			{
//				System.out.print(n-c+1 +" ");
//			}
//			System.out.println();
//		}
		
//	7. Print_top_left_to_bottom_right_65_65,66,_65,66,67_65,66,67,68_65,66,67,68,69;		
			
//		int n=5;
//		
//		for(int r=1; r<=n; r++)
//		{
//			int temp=64;
//			
//			for(int c=1; c<=r; c++)
//			{
//				System.out.print(temp+c +" ");
//			}
//			System.out.println();
//		}
		
//	8. Print_top_left_to_bottom_right_A_A,B_A,B,C_A,B,C,D_A,B,C,D,E;
		
//		int n =5;
//		
//		for(int r=1; r<=n; r++)
//		{
//			int temp=64;
//			for(int c=1; c<=r; c++)
//			{
//				System.out.print((char)(temp+c)+" ");
//			}
//			System.out.println();
//		}
		
//	9. Print_top_right_to_bottom_left_A,B,C,D,E_A,B,C,D,_A,B,C,_A,B_A;
		
//		int n=5;
//		
//		for(int r=1; r<=n; r++)
//		{
//			int temp=64;
//			
//			for(int c=1; c<=n-r+1; c++)
//			{
//				System.out.print((char)(temp+c)+ " ");
//			}
//			System.out.println();
//		}
		
//	10. Print_top_left_to_bottom_right_E,ED,EDC,EDCB,EDCBA;
		
//		int n=5;
//		
//		for(int r=1; r<=n; r++)
//		{
//			int temp=64;
//			
//			for(int c=1; c<=r; c++)
//			{
//				System.out.print((char) (n-c+1+temp) +" ");
//			}
//			System.out.println();
//		}
		
//	11. Print_top_right_to_bottom_left_EDCBA,EDCB,EDC,ED,E;
		
//			int n=5;
//			
//			for(int r=1; r<=n; r++)
//			{
//				int temp=64;
//				
//				for(int c=1; c<=n-r+1; c++)
//				{
//					System.out.print((char)(n-c+1+temp)+ " ");
//				}
//				System.out.println();
//			}
	
			
//	12. Print_Pyramid_using_*;
			
//			int n=4;
//			
//			for(int r=1; r<=n; r++)
//			{
//				for(int s=1; s<=n-r+1; s++)
//				{
//					System.out.print(" " );
//				}
//				
//				for(int c=1; c<=r; c++)
//				{
//					System.out.print("* ");
//				}
//				System.out.println();
//			}
		
			
//	13. Print_diamond
			
			int n=4;
			int n1=5;
			
			for(int r=1; r<=n; r++)
			{
				for(int s=1; s<=n-r+1; s++)
				{
					System.out.print(" " );
				}
				
				for(int c=1; c<=r; c++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			
			
			
			for(int r1=1; r1<=n1; r1++)
			{
				for(int s1=2; s1<=r1; s1++)
				{
					System.out.print(" ");
				}
				
				for(int c1=1; c1<=n1-r1+1; c1++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
}
