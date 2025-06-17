package day11;

public class Employee 
{

	String Name;
	int id;
	
	Employee(String Name,int id)
	{
		this.Name=Name;
		this.id=id;
	}
	public void display()
	{
		System.out.println("name is:"+Name);
		System.out.println("emp id is:"+id);
	}
	
	public static void main(String[] args)
	{

		Employee emp=new Employee("Muskan Jha",777);
		emp.display();
	}

}
