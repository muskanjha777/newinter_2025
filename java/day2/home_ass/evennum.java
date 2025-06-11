package printeven.java;
import java.util.*;

public class evennum
{

	public void printevennos()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println("even nos are:"+i);
			}
		}

	}
	public static void main(String args[])
	{
		evennum ev=new evennum();
		ev.printevennos();
	}

}
