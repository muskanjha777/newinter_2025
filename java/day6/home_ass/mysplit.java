package day7split3.java;

import java.util.Scanner;

public class mysplit {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner("System.in");
		String str="Hello? how are you? good!";
		String details[] =str.split("\\?\\s");
		
		
		for(String detail : details)
		{
			System.out.println(detail.trim());
		}
	    
	}

}
