package day19;

public class Student 
{
	

	int id;
    String name;
    float marks;

    Student(int i, String n, float m) {
        id = i;
        name = n;
        marks = m;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s = new Student(101, "Riya", 85.5f);
        s.display();
    }
}
