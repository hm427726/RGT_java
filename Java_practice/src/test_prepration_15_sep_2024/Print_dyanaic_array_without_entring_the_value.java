package test_prepration_15_sep_2024;

import java.util.*;

public class Print_dyanaic_array_without_entring_the_value {

	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array size");
		
		int arr[]= new int[5];
		
		System.out.println("Enter a number ");
		
		for(int i= sc.nextInt(); i<arr.length; i++)
		{
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
	}
}
