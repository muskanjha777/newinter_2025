package logicalopr.java;
import java.util.*;

public class age
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter your current age :");
		int age = sc.nextInt();
		if(age>=18)
		{
			System.out.println("you are elegible to vote!!!");
		}
		else
		{
			System.out.println("you are minor!!!");
		}
		

	}

}
