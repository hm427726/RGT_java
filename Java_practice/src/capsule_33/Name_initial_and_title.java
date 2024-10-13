package capsule_33;

public class Name_initial_and_title {

	public static void main(String[]args)
	{
		String t="Trainng Centre";
		t=t.trim();
		t=t.replaceAll("\\s+"," ");
		
		String word[]=t.split(" ");
		String str="";
		
		for(int i=0; i<word.length-1; i++)
		{
			char ch= word[i].charAt(0);
			str= str+ch+".";
		}
		System.out.println(str+word[word.length-1]);
	}
}
