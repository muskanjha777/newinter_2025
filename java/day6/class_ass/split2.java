package day7split2.java;
import java.util.*;

public class split2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner("System.in");
		System.out.println("enter your sentence");
		String str="my name is muskan";
	String str1[]=str.split(" ");
	for (String arr1 : str1)
	{
		System.out.println(arr1);
	}
		

	}

}
