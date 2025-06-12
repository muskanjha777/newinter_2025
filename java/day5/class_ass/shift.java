package shiftopr.java;
import java.util.*;

public class shift {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter no :");
		int n1=s.nextInt();
		
		int leftshift=n1 << 2;
		int rightshift=n1 >> 2;
		int unsignedshift=n1 >>> 2;
		
		System.out.println("left shift is:"+leftshift);
		System.out.println("right shift is:"+rightshift);
		System.out.println("unsigned shift is:"+unsignedshift);
	}

}
