package day18;

public class Employee 
{
	int id;
	String name;
	Double salary;
	Employee(int id,String name,Double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void display()
	{
		System.out.println("Id:"+id);
		System.out.println("name:"+name);
		System.out.println("salary:"+salary);
	}
	public static void main(String[] args) 
	
     {
		
		Employee em= new Employee (101,"Muskan",20.300);
		em.display();
		// TODO Auto-generated method stub

	}

}
