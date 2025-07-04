package day16;
import java.util.*;

public class ArithmeticExceptionclass1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no one:");
		int n=sc.nextInt();
		System.out.println("enter the no two:");
		int m=sc.nextInt();
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
