package day12;

import java.util.Scanner;

public class Product 
{

	private int pid;
	private String name;
	private int price;
	
	void gett()
	{
		Scanner sc=new Scanner(System.in)	;
		   System.out.println("enter name");
		   name=sc.nextLine();
		   System.out.println("enter pid ");
		   pid=sc.nextInt();
           System.out.println("enter price ");
		   price=sc.nextInt();
		   

	}
	public void sett()
	{
		System.out.println("pid is:"+pid);
		System.out.println("pname is:"+name);
		System.out.println("price of product is"+price);
	}

	
	public static void main(String[] args)
	{

		Product p=new Product();
		p.gett();
		p.sett();
	}

}
