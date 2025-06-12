package toggle.java;

import java.util.Scanner;

public class togglexor {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter no :");
		int n1=s.nextInt();
		int toggledn1= n1 ^ 1;
		
		System.out.println("original no is:"+n1);
		System.out.println("toggle the last bit using xor the no become:"+toggledn1);
	
	}

}
