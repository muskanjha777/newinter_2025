package day10;

public class Car {
	
	String Manufacturer;
	String Name;
	int price;
	
	Car(String Manufacturer,String Name,int price)
	{
		 this.Manufacturer = Manufacturer;
		 this.Name=Name;
		 this.price=price;

	}
	public void show()
	{
		System.out.println("Manufacturer is:"+Manufacturer);
		System.out.println("Name of car is:"+Name);
		System.out.println("Price of car is"+price);
	}

	public static void main(String[] args) 
	{
      Car c=new Car("Tata motors","SWift",1);
      c.show();
	}

}
