package day9;

import java.util.Scanner;

public class Swapxor {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a no 1:");
		int no =s.nextInt();
		System.out.println("enter a no2:");
		int no2 =s.nextInt();
		no=no^no2;
		no2=no^no2;
		no=no^no2;
		System.out.println("no 1 is:"+no);
		System.out.println("no 2 is:"+no2);
		



	}

}
