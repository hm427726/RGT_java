package string;

public class COuntFrequencyOfString {

	public static void main(String[]args)
	{
		String j= "Jamshed Mehdi Kazmi";
		char arr[]= j.toCharArray();
		
		for(int i=0; i<arr.length; i++)
		{
			int cnt =1;
			if(arr[i]!='$')
			{
				for(int n= i+1; n<arr.length; n++)
				{
					if(arr[i]==arr[n])
					{
						cnt++;
						arr[n]='$';
					}
				}
				System.out.println(arr[i]+"----->"+ cnt);
			}
		}
	}
}
