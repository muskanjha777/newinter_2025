package day9;

import java.util.Scanner;

public class senior {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age:");
		int age=sc.nextInt();
		if(age<18 && age>1)
		{
			System.out.println("you are child");
		}
		else if(age<18 && age>45)
		{
			System.out.println("you are adult");
		}
		else
		{
			System.out.println("you are senior citizen");
		}

		
	}

}
