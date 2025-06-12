package day8;

import java.util.Scanner;

public class vowelcons {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a charactere:");
		String vow =s.next();
		switch(vow)
		{
		case "a":System.out.println("a is vowel");
		break;
		case "e":System.out.println("e is vowel");
		break;
		case "i":System.out.println("i is vowel");
		break;
		case "o":System.out.println("o is vowel");
		break;
		case "u":System.out.println("u is vowel");
		break;
		default :System.out.println("it is consonant");
		
		}

	}

}
