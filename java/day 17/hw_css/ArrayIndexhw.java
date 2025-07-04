package day17;

import java.util.Scanner;

public class ArrayIndexhw {

	public static void main(String[] args) 
	{
		int[] numbers= {10,20,30,40,50};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an index to access (0-4):");
		int index =sc.nextInt();
		try
		{
			System.out.println("Value at index"+index+"is"+numbers[index]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error:Invalid index!please enter index between 0 and 4.");
		}
		// TODO Auto-generated method stub

	}

}
