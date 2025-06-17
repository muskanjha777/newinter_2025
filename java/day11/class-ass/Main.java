package day11;
abstract class Device
{
	abstract void powerOn();
}
class SmartPhone extends Device
{
	void powerOn()
	{
		System.out.println("Your SmartPhone is powerOn.");
	}
}
class Tablet extends Device
{
	void powerOn()
	{
		System.out.println("Your Tablet is PowerOn.");
	}
}


public class Main {

	public static void main(String[] args) {
		SmartPhone s= new SmartPhone();
		s.powerOn();
		Tablet t = new Tablet();
		t.powerOn();
	}

}