package day8;

import java.util.Scanner;

public class traffic {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a colour with upper letter first:");
		String cl =s.next();
		switch(cl)
		{
		case "Red":System.out.println("stop");
		break;
		case "Green":System.out.println("Go");
		break;
		case "Orange":System.out.println("prepare to stop");
		break;
		default:System.out.println("en valid traffic light colour");
		break;
		
		}

	}

}

	