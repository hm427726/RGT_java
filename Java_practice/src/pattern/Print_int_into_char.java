package pattern;

public class Print_int_into_char {

	public static void main(String[]args)
	{
		// A
		// A B
		// A B C 
		// A B C D
		
//		int n =5;
//		
//		for(int r=1; r<=n; r++)
//		{
//			int temp=64;
//			
//			for(int c=1; c<=r; c++)
//			{
//				System.out.print((char) (temp+c) +" ");
//			}
//			System.out.println();
//		}
		
		
//		EDCBA
//		EDCB
//		EDC
//		ED
//		E
		
		int n =5;
		
		for(int r=1;r<=n; r++)
		{
			for(int s=1; s<=n-r+1; s++)
			{
				System.out.print(" ");
			}
			
			for(int c=1; c<=r; c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
