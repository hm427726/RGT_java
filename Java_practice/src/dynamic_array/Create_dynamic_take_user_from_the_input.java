package dynamic_array;

import java.util.*;

public class Create_dynamic_take_user_from_the_input {

	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number of index");
		
		int arr[]= new int[sc.nextInt()];
		
		System.out.println("Enter a number");
		
		for(int i = sc.nextInt(); i<arr.length; i++)
		{
			arr[i]=i+1;
			System.out.println(arr[i]);
		}
	}
}
