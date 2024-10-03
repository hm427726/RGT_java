package function;

public class Variables {

	String name;
	String institute = " RGT";
	int roll;
	
	public void Hassan()
	{
		name="Hassan";
		int roll=10;
		institute= "bcp";
		
		System.out.println(name+ " "+roll+" "+institute);
	}
	public void Shakir()
	{
		name="Shakir";
		roll= 11;
		System.out.println(name+" "+roll+""+institute);
	}
	public static void main(String[]args)
	{
		Variables ob= new Variables();
		
		ob.Shakir();
		ob.Hassan();
		
	}
}
