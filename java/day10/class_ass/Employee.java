package day10;
import java.util.Scanner;



class Person {
	 String name;
	 int age;

	 void accept(Scanner sc) {
	     System.out.print("Enter the name: ");
	     name = sc.nextLine();

	     System.out.print("Enter the age: ");
	     age = sc.nextInt();
	     sc.nextLine(); // Consume the leftover newline
	 }
	}


public class Employee extends Person{
	
	
	double sal;

	 void acceptEmp(Scanner sc)
	 {
	     System.out.print("Enter the salary: ");
	     sal = sc.nextDouble();
	 }

	 void display() 
	 {
	     System.out.println("\n--- Employee Details ---");
	     System.out.println("Name: " +name);
	     System.out.println("Age: " +age);
	     System.out.println("Salary: " + sal);
	 }

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); // One Scanner object for all input

	     Employee e = new Employee();
	     e.accept(sc);
	     e.acceptEmp(sc);
	     e.display();

	     sc.close(); // Always close the Scanner
	}

}
