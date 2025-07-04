package day18;

public class Allconstructor 
{
	int id;
	String name;
	Double salary;
	Allconstructor()
	{
		System.out.println("Id:"+id);
		System.out.println("name:"+name);
		System.out.println("salary:"+salary);

	}
	Allconstructor(int id,String name,Double salary)
	{
			this.id=id;
			this.name=name;
			this.salary=salary;
	}
	Allconstructor(Allconstructor m)
	{
		id=m.id;
		name=m.name;
		salary=m.salary;
		
	}
	void display()
	{
		System.out.println("Id:"+id+"name"+name+"salary"+salary);
	}

    public static void main(String[] args)
	{
    	Allconstructor ac1=new Allconstructor(101,"Muskan",10.99);
    	Allconstructor ac2=new Allconstructor(102,"sayali",11.99);
    	Allconstructor ac3=new Allconstructor(ac2);
    	ac1.display();
    	ac2.display();
    	ac3.display();
    	
    	
		
    	
		// TODO Auto-generated method stub

	}

}
