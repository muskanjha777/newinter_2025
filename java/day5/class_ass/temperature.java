package temp.java;

import java.util.Scanner;

public class temperature {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter todays temperature value:");
		float temp =s.nextInt();
		if(temp>35)
		{
			System.out.println("today is hott!!!");
		}
		else
		{
			System.out.println("todays temperature is normal!!!");
		}

	}

}
