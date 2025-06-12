package day8;

import java.util.Scanner;

public class divisibility {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a no:");
		int no =s.nextInt();
		if(no%5==0 && no%11==0)
		{
			System.out.println(no+" is divisible by both 5 and 11");
		}
		else
		{
			System.out.println(no+" is Not divisible by both 5 and 11 ");
		}

	}

}
