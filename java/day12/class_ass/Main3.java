package day12;

abstract class Vehicle
{
	abstract void start();
}

class Car extends Vehicle
{
	public void start()
	{
		System.out.println("Car starts");
	}
}
class Bike extends Vehicle
{
	public void start()
	{
		System.out.println("Bike Starts");
	}
}

public class Main3 {

	public static void main(String[] args) {
		
		Car a=new Car();
		a.start();
		Bike b=new Bike();
		b.start();
		// TODO Auto-generated method stub

	}

}
