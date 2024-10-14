package test_prepration_14_Oct_2024;

public class Find_frequency_of_a_string {

	public static void main(String[]args)
	{
		String h="hassan mehdi is student of regrow tech";
		h=h.trim();
		h=h.replaceAll("\\s+", " ");
		
		char arr[]=h.toCharArray();
		
		for(int i=0; i<arr.length; i++)
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
				System.out.println(arr[i]+"----->"+cnt);
			}
		}
	}
}
