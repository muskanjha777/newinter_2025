package day16;

import java.util.Scanner;

public class Arithmeticopr3 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no one:");
		int divisor=sc.nextInt();
		System.out.println("enter the no two:");
		int dividend=sc.nextInt();
		try 
		{
			int div=divisor/dividend;
			System.out.println("division is:"+div);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(Exception f)
		{
			System.out.println(f);
		}
         finally
         {
        	 System.out.println("Program Terminated");
         }
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

	}

}
