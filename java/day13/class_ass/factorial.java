package day13;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in)	;
		   System.out.println("enter a no");
		int  no=sc.nextInt();
		long fact=1;
		int i;
		for( i=1; i<=no;i++)
		{
			fact*=i;
		}
	 System.out.println("factorial of"+no+"is"+fact);

	}

}
