package day8;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter no :");
		int no=s.nextInt();
		if(no%2==0)
		{
			System.out.println(no+"is even no");
		}
		else
		{
			System.out.println(no+":is odd no");
		}

	}

}
