package test_prepration_9_sep_2024;

public class Capsule_15 {

	public static void main(String[]args)
	{
//	1.
//		int table_of=2;
//		
//		for(int i=1; i<=10; i++)
//		{
//			System.out.println(table_of + "*" + i +"=" + table_of*i);
//		}
		
//	2.
//		int n=20;
//		
//		for(int i=1; i<=n; i++)
//		{
//			if(i%2==0)
//			{
//				System.out.println(i);
//			}
//		}
		
//	3. 
//		int n=20;
//		
//		for(int i=1; i<=n; i++)
//		{
//			if(i%2!=0)
//			{
//				System.out.println(i);
//			}
//		}

//	4.
		
//		for(int n=3; n<=10;n++)
//		{
//			int fact=1;
//			int sum= 0;
//			for(int i=1; i<=n; i++)
//			{
//				fact=fact*i;
//			}
//			sum=sum+fact;
//			
//			System.out.println(" Factorial of "+n+" is:- " +sum);
//			
//		}
		
//	5.
		
		int n=20;
		
		for(int i=1; i<=n; i++)
		{
			int cnt=0;
			for(int j=1; j<=i; j++)
			{
				if(i%j==0)
				{
					cnt++;
				}
			}
			if(cnt==2)
			{
				System.out.println(i+" Prime_Number ");
			}
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
