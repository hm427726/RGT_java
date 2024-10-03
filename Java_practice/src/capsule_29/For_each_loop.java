package capsule_29;

public class For_each_loop {

	public static void main(String[]args)
	{
		For_each_loop ob =new For_each_loop();
		
		int arr[]= {2,3,4,5,6,7,8,9,9,10};
		ob.even(arr);
	}
	
	public void even(int arr[])
	{
		for(int each_val: arr)
		{
			if(each_val%2==0)
			{
				System.out.println(each_val);
			}
		}
	}
}
