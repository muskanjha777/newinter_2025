package positiveno.java;

import java.util.Scanner;

public class posnegno {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter no :");
		int n1=s.nextInt();
		if(n1<0)
		{
			System.out.println("no is negative:"+n1);
		}
		else if(n1==0)
		{
			System.out.println("no is equal to zero:"+n1);
		}
		else
		{
			System.out.println("no is positive:"+n1);
		}
	}

}
