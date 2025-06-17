package day10;
class Vehicle
{
  void start()
  {
    System.out.println("Vehicle start");
  }
}
class Bike extends Vehicle
{
  void ride()
  {
   System.out.println("Riding the bike.");
  }
}
class CarDemo extends Vehicle
{
  void drive()
  {
    System.out.println("Driving a car");
  }
}

public class Main1
{

	public static void main(String[] args) 
	{
		
			Bike b= new Bike();
			  b.start();
			  b.ride();
			  CarDemo c = new CarDemo();
			  c.start();
			  c.drive();
		// TODO Auto-generated method stub

	}

}
