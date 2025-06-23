package day12;

public class Bankaccount {
	
	long acnum;
	int bal;
	int damt;

	
	
	
	Bankaccount(long acnum,int bal,int damt)
	{
		this.acnum=acnum;
		this.bal=bal;
		this.damt=damt;
	}
	
	
	 void deposit()
	{
		
		if(damt>0)
		{
			bal += damt;
           System.out.println("you have bal"+bal);
		}
	   else
	   {
		   System.out.println("enter the correct amt:");
	   }

	}
	void withdraw()
	{
		 if (damt <= 0)
	        {
	            System.out.println("Withdrawal amount must be positive.");
	        } 
	        else if (damt > bal)
	        {
	            System.out.println("Insufficient balance.");
	        } else
	        {
	            bal -= damt;
	            System.out.printf("Withdrawn %.2f. New balance: %.2f\n", damt, bal);
	        }

	}
	
	 void displayinfo()
	{
		System.out.println("acnumber:"+acnum+"balance"+bal);
	}
	

	public static void main(String[] args)
	{
		
		Bankaccount b=new Bankaccount(12345,34000,500);
		b.deposit();
		b.withdraw();
		b.displayinfo();
		
		// TODO Auto-generated method stub

	}

}
