package expression2.java;

import java.util.Scanner;

public class arthexpression {

	public static void main(String[] args)
	{

		Scanner s=new Scanner(System.in);
		System.out.println("enter a :");
		int a=s.nextInt();
		System.out.println("enter b :");
		int b=s.nextInt();
		System.out.println("enter c :");
		int c=s.nextInt();
		System.out.println("enter d :");
		int d=s.nextInt();
		int e=0;
		
		int result=(a+b)*(c-d)/e;
		System.out.println("result is:"+result);

	
	}

}
