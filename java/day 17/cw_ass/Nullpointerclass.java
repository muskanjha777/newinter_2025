package day17;

public class Nullpointerclass {

	public static void main(String[] args) 
	{
		String str=null;
		try
		{
			System.out.println("Length:"+str.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("caught NullpointerException:"+e.getMessage());
			
		}
		

	}

}
