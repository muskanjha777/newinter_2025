package greaterno.java;
import java.util.*;

public class greater {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter no 1:");
		int a=s.nextInt();
		System.out.println("enter no 2:");
		int b=s.nextInt();
		if(a>b)
		{
			System.out.println("a is greater:"+a);
		}
		else if(a==b)
		{
			System.out.println("both are equal: \n no1:"+a+"\n no2:\n"+b);
		}
		else
		{
			System.out.println("b is greater:"+b);
		}
	}

}
