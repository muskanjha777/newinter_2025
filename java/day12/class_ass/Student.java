package day12;

import java.util.Scanner;

public class Student 
{
	
	private String name;
	private int age;
	
	//getter 
	public void get()
	{
	  Scanner sc=new Scanner(System.in)	;
	  System.out.println("enter name ");
	   name=sc.nextLine();
	   System.out.println("enter age");
	   age=sc.nextInt();
	 
		
	}
	//setter
	public void set()
	{
		System.out.println("name is:"+name);
		System.out.println("age is:"+age);
	}
	public static void main(String[] args)
	{
		
		Student s=new Student();
		s.get();
		s.set();
		
		
		// TODO Auto-generated method stub

	}

}
