package day18;

public class Student {

	int rollno,
	m1,m2,m3;
	
	Student(int rollno,int m1,int m2,int m3)
	{
		this.rollno=rollno;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	void display()
	{
		int total=m1+m2+m3;
		System.out.println("total marks is:"+total);
	}
	
   public static void main(String[] args)
	{
		Student s=new Student(101,70,80,90);
		s.display();
		
		// TODO Auto-generated method stub

	}

}
