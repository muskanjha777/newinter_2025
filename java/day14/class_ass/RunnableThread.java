package day14;

class RunnableThread implements Runnable
{

	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
		}
	}
	
	public static void main(String[] args) 
	{
		
		RunnableThread r=new RunnableThread();
		Thread t=new Thread(r);
		t.start();
		
		
		// TODO Auto-generated method stub

	}

}
