package static_array;

public class Print_1_5_using_static_array {

	public static void main(String[]args)
	{
		int arr[]= {12,13,14,15,16,18,4,20};
		
//		System.out.println(arr[3]);
//		System.out.println(arr[6]);
//		System.out.println(arr[4]);
//		
//		System.out.println(arr[arr.length-1]);
//		System.out.println(arr[0]);
		
//		for(int i=0; i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
		
//	2. Print even number in the arr[index];
		
//		for(int i =0; i<arr.length; i++)
//		{
//			if(arr[i]%2==0)
//			{
//				System.out.println(arr[i]);
//			}
//		}
	
//	3.Print odd number in the arr[index];
		
//		for(int i=0; i<arr.length; i++)
//		{
//			if(arr[i]%2!=0)
//			{
//				System.out.println(arr[i]);
//			}
//		}
		
//	4. Search 4 in the arr[index];
		
		int search=4;
		boolean is_found=false;
		
		for(int i=0; i<arr.length; i++)
		{
			if(search==arr[i])
			{
				is_found=true;
				System.out.print(arr[i]);
			}
		}
		
		if(is_found==true)
		{
			System.out.print(" FOUND");
		}
		else
		{
			System.out.print(" Not Found");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
