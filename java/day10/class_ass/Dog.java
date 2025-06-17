package day10;
class Animal
{
	void sound()
	{
		System.out.println("Animal makes sound.");
	}
}

public class Dog extends Animal
{
	
	void bark()
	{
		System.out.println("Dog is barking.");
	}

	public static void main(String[] args) {
		Dog d= new Dog();
		d.sound();
		d.bark();

	}

}
