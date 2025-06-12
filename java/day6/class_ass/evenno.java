package day7.even;

import java.util.Scanner;

public class evenno {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter int a :");
		int a=s.nextInt();
		if(a==0)
		{
			System.out.println("no is zero:");
		}
		else if(a%2==0)
		{
			System.out.println("no is even");
		}
		else
		{
			System.out.println("no is odd");
		}

	}

}
