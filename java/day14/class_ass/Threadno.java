package day14;

import java.util.Scanner;

public class Threadno extends Thread
{

	public void run()
	{
		
		try{
		Scanner sc=new Scanner(System.in)	;
		   System.out.println("enter no");
		  int no=sc.nextInt();
		  for(int i=1;i<=no;i++)
		  {
			  System.out.println("no:"+i);
			  Thread.sleep(1000);

		  }
		}
		  catch(InterruptedException e)
		  {
			 System.out.println("THread Interrrupted");
		  }
				  
		  
}
		  
public static void main(String[] args)
{
		Threadno t=new Threadno();
		t.start();
	
	
	// TODO Auto-generated method stub

	}

}
