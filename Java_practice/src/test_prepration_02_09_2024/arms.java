package test_prepration_02_09_2024;

public class arms {
public static void main(String args[]) {
	for(int i=100;i<=200;i++)
	{
		int n=i;
		int n1=i;
		int cnt=0;
		int ld;
		while(n>0)
		{
			n=n/10;
			cnt++;
			
		}
		int sum=0;
		while(n1>0)
		{
			ld=n1%10;
			n1=n1/10;
			int pow=(int)Math.pow(ld, cnt);
			sum=sum+pow;
			
		}
		if(sum==i)
		{
			System.out.println(i);
		}
	}
}
}
