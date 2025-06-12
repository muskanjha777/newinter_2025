package avrgcal.java;
import java.util.*;

public class calavrg {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the no 1 :");
		int n1 = sc.nextInt();
		System.out.println("enter the no 2 :");
		int n2 = sc.nextInt();
		System.out.println("enter the no 3 :");
		int n3 = sc.nextInt();
		float avrg= (n1+n2+n3)/3;
		System.out.println("avrg of three nos are:"+avrg);
	}

}
