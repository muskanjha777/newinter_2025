package logical.java;

import java.util.Scanner;

public class logicalopr {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter your marks");	
		int marks=s.nextInt();
		if(marks<100 && marks>90)
		{
         System.out.println("a grade");
	    }
		else if(marks<90 && marks>80)
		{
         System.out.println("b grade");
	    }
		else if(marks<80 && marks>70)
		{
         System.out.println("c grade");
	    }
		else if(marks<70 && marks>40)
		{
         System.out.println("d grade");
	    }
		else
		{
			System.out.println("you are fail");
		}
		
		
		

}
}
