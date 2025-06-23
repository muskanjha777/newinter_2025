package day12;


abstract class Animal
{
	abstract void makesound();
}
class Dog extends Animal
{
	void makesound()
	{
		System.out.println("Dog barks");
	}
}
class Cat extends Animal
{
	void makesound()
	{
		System.out.println("Cat meows");
	}
}

public class Main1 {

	public static void main(String[] args)
	{


		Dog d=new Dog();
		d.makesound();
		Cat c=new Cat();
		c.makesound();
	}

}
