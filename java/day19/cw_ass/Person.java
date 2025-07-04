package day19;

public class Person {

	
    String name;
    int age;

    Person() 
    {
        name = "Muskan";
        age = 17;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.display();
    }
}
