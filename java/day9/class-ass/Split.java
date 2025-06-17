package day9;

import java.util.Scanner;

public class Split {

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		String str="my name is muskan";
	    String str1[]=str.split(" ");
    	for (String arr1 : str1)
	   {
		System.out.println(arr1);
	   }

		
	}

}
