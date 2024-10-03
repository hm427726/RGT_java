package capsule_22;

public class Questions {

	public static void main(String[]args)
	{
		
//	1. FIND ALL EVEN NUMBER IN ARRAY.
		
//		int arr[]= {6,7,4,5,8,9,10,11,13,12,16};
//		
//		for(int i=0; i<arr.length; i++)
//		{
//			if(arr[i]%2==0)
//			{
//				System.out.println(arr[i]);
//			}
//		}
////		
//	2. FIND ALL PRIME NUMBER IN ARRAY;
		
		int arr[]= {4,3,2,7,9,11,13,34,36,46,49,70,33,31,37};
		
		for(int i=1; i<arr.length; i++)
		{
//			arr[i]= 3;
			int cnt=0;
			
			for(int j=1; j<=arr[i]; j++)
			{
				if(arr[i]%j==0)
				{
					cnt++;
				}
			}
			if(cnt==2)
			{
				System.out.println(arr[i]+ " Prime Number");
			}
		} 
		
//	3. Print sum of elements in the array.
		
//		int arr[]= {2,3,4,5};
//		int sum=0;
//		
//		for(int i=0; i<arr.length; i++)
//		{
//			sum=sum+arr[i];
//		}
//		System.out.println(sum);
		
//	4. Find the product of sum is the array;
		
//		int arr[]= {2,3,5,6};
//		int pro=1;
//		
//		for(int i=0; i<arr.length; i++)
//		{
//			pro=pro*arr[i];
//		}
//		System.out.println(pro);
		
//	5. Find the greatest value in the array using sorting value;
		
//		int arr[]= {8,2,3,4,5,4,9};
//		
//	for(int i=0; i<=arr.length; i++)
//	{
//		for(int j=i; j<arr.length; j++)
//		{
//			if(arr[i]>arr[j])
//			{
//				int temp=arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//			}
//		}
//	}
//	System.out.println("Greatest Number of array index is :- " + arr[arr.length-1]);
//	System.out.println("Lowest number of array index is :- " + arr[0]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
