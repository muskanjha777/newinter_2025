package day16;

public class ArithmeticExceptionclass {

	public static void main(String[] args) 
	{
		
		int n=10;
		int m=0;
		try
		{
			int div=n/m;
			System.out.println("division is:"+div);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		// TODO Auto-generated method stub

	}

}
