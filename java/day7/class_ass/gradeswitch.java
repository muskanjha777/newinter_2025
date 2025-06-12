package day8;

import java.util.Scanner;

public class gradeswitch {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter  your grade:");
		String a =s.next();
		
		switch(a)
		{
		case "a":System.out.println("Excellent");
		break;
		case "b":System.out.println("good");
		break;
		case "c":System.out.println("average");
		break;
		case "d":System.out.println("below average");
		break;
		case "f":System.out.println("u are fail!!");
		break;
		default :System.out.println("incorrect grade");
	}

}
}
