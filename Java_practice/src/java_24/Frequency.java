package java_24;

public class Frequency {

	public static void main(String[]args)
	{
		String h="hassan mehdi";
		h=h.replaceAll("\\h+"," ");
		h=h.trim();
		char arr[]= h.toCharArray();
		
		for(int i=0;i<arr.length; i++)
		{
			int cnt=1;
			if(arr[i]!='$')
			{
				for(int j=i+1; j<arr.length; j++)
				{
					if(arr[i]==arr[j])
					{
						cnt++;
						arr[j]='$';
					}
				}
				System.out.println(arr[i]+"----->"+ cnt);
			}
		}
				
	}
}
