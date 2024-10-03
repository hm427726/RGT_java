package capsule_15;

public class Print_Prime_number_between_1_to_10 {

	public static void main(String[]args)
	{
		int i=1;
		int n=20;
		while(i<=n)
		{
			int a=1;
			int cnt=0;
			while(a<=i)
			{
				if(i%a==0)
				{
					cnt++;
				}
				a++;
			}
			if(cnt==2)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}
