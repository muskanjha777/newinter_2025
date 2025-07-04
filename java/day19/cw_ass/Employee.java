package day19;

public class Employee {

    int id;
    String name;

    Employee(int i, String n) {
        id = i;
        name = n;
    }

    // Copy constructor
    Employee(Employee e) {
        id = e.id;
        name = e.name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Amit");
        Employee e2 = new Employee(e1); // using copy constructor

        e1.display();
        e2.display();
    }
}

