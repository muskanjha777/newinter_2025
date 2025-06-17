package day10;
class User
{
	String usernm;
	String email;
	User(String usernm, String email)
	{
		this.usernm=usernm;
		this.email=email;
	}
	void display()
	{
		System.out.println("Username:-"+usernm);
		System.out.println("email:-"+email);
	}
}
public class Admin extends User
{
	

	int adminlvl;
	Admin(String usernm, String email, int adminlvl)
	{
		super(usernm,email);
		this.adminlvl=adminlvl;
	}
	void displayInfo()
	{
		super.display();
		System.out.println("AdminLevel:"+adminlvl);
	}
	
	

	public static void main(String[] args) {
		Admin a= new Admin("Muskan Jha","muskanmjha777@gmail.com",1);
		//a.display();
		a.displayInfo();

	}

}


