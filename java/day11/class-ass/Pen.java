package day11;

public class Pen
{
	String Brand;
	String color;
	 
	Pen(String Brand,String color)
	{
		this.Brand=Brand;
		this.color=color;
	}
	public void display()
	{
		System.out.println("Brand of the pen is:"+Brand);
		System.out.println("Color of the pen is:"+color);
	}
	public static void main(String[] args) 
	{

		Pen p=new Pen("trimax","Light Blue");
		p.display();
		
	}

}
