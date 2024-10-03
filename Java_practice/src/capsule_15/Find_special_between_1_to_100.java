package capsule_15;

public class Find_special_between_1_to_100 {

	public static void main(String[]args)
	{
//		for(int i=1;i<=100;i++)
//		{
//			
//			int n=i;
//			int ld;
//			int sum=0;
//			while(n>0)
//			{
//				ld=n%10;
//				n=n/10;
//				int a=1;
//				int fact=1;
//				while(a<=ld)
//				{
//					fact=fact*a;
//					a++;
//				}
//				sum=sum+fact;
//			}
//			if(sum==i)
//			{
//				System.out.println(i);
//			}
//		}
		
		
		
	
			int n = 5;
			
			for(int r = 1; r<=n; r++)
			{
				for(int c = 1; c<=n-r+1; c++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
	}
}

