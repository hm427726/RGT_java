package capsule_15;

public class Print_all_odd_number_using_for_loop {

	public static void main(String[]args)
	{
		int n = 20;
		
		for(int i = 1; i<=n; i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
}
