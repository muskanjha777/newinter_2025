package day13;

import java.util.Scanner;

public class Factorial5 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in)	;
		int  no=5;
		long fact=1;
		int i;
		for( i=1; i<=no;i++)
		{
			fact*=i;
		}
	 System.out.println("factorial of:"+no+" is "+fact);

	}

}
