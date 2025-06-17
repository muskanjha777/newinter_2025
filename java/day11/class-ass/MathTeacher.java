package day11;

import java.util.Scanner;

class Teacher
{
	String name;
	String sub;
	void accept(Scanner sc)
	{
		System.out.println("enter your name");
	     name=sc.nextLine();
		System.out.println("enter your subject");
		sub=sc.nextLine();
		
	}
	
	 void display1()
	{
		System.out.println("name is"+name);
		System.out.println("Subject is:"+sub);
	}
}
 
public class MathTeacher extends Teacher{
 int yrs;
	void accept2(Scanner sc)
	{
		System.out.println("enter field experience years");
		 yrs=sc.nextInt();
	}
	void display()
	{
		System.out.println("field experience years:"+yrs);
		
	}
	
	public static void main(String[] args)
	{
       Scanner sc =new Scanner(System.in);
       
       MathTeacher m=new MathTeacher();
       m.accept(sc);
       m.accept2(sc);
       m.display1();
       m.display();
		
	}

}
