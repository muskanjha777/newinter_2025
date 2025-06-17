package day11;

public class Product
{
	
	String product1;
	
	Product(String product1)
	{
		this.product1=product1;
	}
	public void DisplayDetails()
	{
		System.out.println("I m "+product1+" of class");
	}

	public static void main(String[] args) 
	
	{
		Product p1=new Product("Laptop");
		Product p2=new Product("Mobile");
		Product p3=new Product("T.v");
		p1.DisplayDetails();
		p2.DisplayDetails();
		p3.DisplayDetails();
		
		
		
	}

}
