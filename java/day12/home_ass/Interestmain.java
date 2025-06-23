package day12;

abstract class Bank
{
	abstract double getInterest();
	
	
	public double cal(int principal,int time)
	{
       double rate=getInterest();
        return(principal*time*rate)/100;
	
	}

}
class Sbi extends Bank
{
	
	     public double getInterest()
	{

    	 return 6.5;
    	 
	}
	
}
class Hdfc extends Bank
{
	
	public double getInterest()
	{
		
	 return 7.0;
		

	}

}

public class Interestmain {

	public static void main(String[] args) 
	{
		
		Hdfc b= new Hdfc();
		Sbi s=new Sbi();
		int principal=1000;
		int time=2;
		System.out.println("interst rate of sbi is"+s.getInterest());
		System.out.println("SBI interst on:"+principal+"for"+time+"years:"+s.cal(principal,time));
		
		System.out.println("interst rate of hdfc is"+b.getInterest());
		System.out.println("SBI interst on:"+principal+"for"+time+"years:"+b.cal(principal,time));
		
		
				
		// TODO Auto-generated method stub

	}

}
