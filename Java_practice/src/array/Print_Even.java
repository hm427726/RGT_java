package array;

public class Print_Even {

	public static void main(String[] args) {
		int arr[]  = {5,12,5,8,9,12,13,14,2};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(i+" index value"+arr[i]);
			}
		}

	}

}
