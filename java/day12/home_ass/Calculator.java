package day12;

public class Calculator {
	
	int add(int a,int b)
	{
		return a+b;
	}
	double add(double a,double b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}

	public static void main(String[] args) 
	{
		Calculator c=new Calculator();
		System.out.println("add: through int "+c.add(5, 5));
		System.out.println("add: through double"+c.add(6.6,6.6));
		System.out.println("add:through int"+c.add(4,4,4));


		// TODO Auto-generated method stub

	}

}
