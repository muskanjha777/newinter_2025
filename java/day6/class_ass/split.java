package day7split.java;

import java.util.Scanner;

public class split {

	public static void main(String[] args) 
	{
	
		Scanner s=new Scanner(System.in);
		System.out.println("enter student details(comma separated) :");
		String input= s.nextLine();
		String details[] =input.split(",");
		System.out.println("student details:");
		
		for(String detail : details)
		{
			System.out.println(detail.trim());
		}

	}

}
