package day12;

abstract class Shape
{
	abstract void area();
}
 class Circle extends Shape
{
	int r;
	float pi=3.14f;
	
	Circle(int r)
	{
		this.r=r;
	}
	public void area()
	{
		
		float a=pi*r*r;
		System.out.println("area of circle is:"+a);
		
	}
	
}
 class Rectangle extends Shape
{
	int l;
	int b;
	 Rectangle(int l,int b)
	 {
		 this.l=l;
		 this.b=b;
		 
	 }
	 public void area()
	 {
		 int ar=l*b;
		 System.out.println("area of Rectangle is"+ar);
	 }
}
public class Main2 {

	public static void main(String[] args) {
		
		Circle c=new Circle(2);
		c.area();
		Rectangle r=new Rectangle(2,2);
		r.area();
		// TODO Auto-generated method stub

	}

}
