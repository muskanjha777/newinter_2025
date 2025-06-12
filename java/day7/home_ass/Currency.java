package day8;

import java.util.Scanner;

public class Currency {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a currency code among (Inr,Usd,Eur,Gbp):");
		String chr=s.next();
		switch(chr)
		{
		case "Inr":System.out.println("...₹...❀");
		break;
		case "Usd":System.out.println("...$...");
		break;
		case "Eur":System.out.println("...€...");
		break;
		case "Gbp":System.out.println("...₤...");
		break;
	    default :System.out.println("enter valid curr code");
		}
	}

}
