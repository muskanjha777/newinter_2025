package day11;

class BankAccount
{
	String accountHolder;
	int accountNumber;
	double balance;
	
	void displayAccountDetails()
	{
		System.out.println("accountHolder:"+accountHolder);
		System.out.println("accountNumber:"+accountNumber);
		System.out.println("Balance:"+balance);
	}
}
public class SavingsAccount extends BankAccount
{

	double interestRate;
	void displayAccountDetail()
	{
		System.out.println("Interest Rate:"+interestRate+"%");
	}
	
	
	public static void main(String[] args) 
	{
		
		SavingsAccount s=new SavingsAccount();
		s.accountHolder="Muskan jha";
		s.accountNumber=10000;
		s.balance=23000;
		s.interestRate=2.3;
		s.displayAccountDetails();
		s.displayAccountDetail();
	}

}
