package day11;

public class Mobile {
	
	
	String Modelname;
	int price;
	 
	Mobile(String Modelname,int price)
	{
		this.Modelname=Modelname;
		this.price=price;
	}
	public void display()
	{
		System.out.println("model of the mobile is:"+Modelname);
		System.out.println("price of the mobile is:"+price);
	}


	public static void main(String[] args) 
	{
 
		Mobile m1=new Mobile("Apple",44000);
		Mobile m2=new  Mobile("Samsung",32000);
		m1.display();
		m2.display();
		
	}

}
