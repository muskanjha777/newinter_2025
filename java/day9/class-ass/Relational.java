package day9;

import java.util.Scanner;

public class Relational {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no1:");
		int a=sc.nextInt();
		System.out.println("enter no2:");
        int b=sc.nextInt();
		if(a>b)
		{
			System.out.println("a is greater"+a);
		}
		else
		{
			System.out.println("b is greater"+b);
		}
	}

}
