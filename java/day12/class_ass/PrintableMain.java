package day12;
interface Printable
{
	abstract void print();
	
}
class Document implements Printable
{
	public void print()
	{
		System.out.println("Document is printing");
	}
}
class Photo implements Printable
{
	
	public void print()
	{
		System.out.println("photo is printing");
	}
}

public class PrintableMain {

	public static void main(String[] args) 
	{
		Document d=new Document();
		d.print();
		Photo p=new Photo();
		p.print();
		
		// TODO Auto-generated method stub

	}

}
