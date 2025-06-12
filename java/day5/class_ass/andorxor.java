package bitwise.java;

import java.util.Scanner;

public class andorxor {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter no 1:");
		int n1=s.nextInt();
		System.out.println("enter no 2:");
		int n2=s.nextInt();
		
		int andResult =n1 & n2;
		int orResult =n1 | n2;
		int xorResult =n1 ^ n2;
		
		System.out.println("Bitwise and:"+andResult);
		System.out.println("Bitwise or:"+orResult);
		System.out.println("Bitwise xor:"+xorResult);
		
		
		

	}

}
