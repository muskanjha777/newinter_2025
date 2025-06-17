package day11;

class Animal
{
	void eat()
	{
		System.out.println("i m method eat");
	}
}

public class Dog extends Animal {
	
	void bark()
	{
		System.out.println("I m method bark");
		eat();
	}

	public static void main(String[] args) 
	{
      
		Dog obj=new Dog();
		obj.eat();
		obj.bark();
		
	}

}
