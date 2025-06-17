package day10;
import java.util.*;

public class Student
{
	String name;
	int age;
	
	Student(String name,int age)
	{
     this.name=name;
     this.age=age;
	}
	public void show()
	{
	
	System.out.println("name of student is:"+name);
	System.out.println("age of the Student is:"+age);
	}

	
	public static void main(String[] args) 
	{
		
		Student s=new Student("Muskan",17);
		s.show();
	}

}
