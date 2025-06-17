package day10;
import java.util.*;

public class Book {
	String Author;
	String Title;
	
	Book(String Author,String Title)
	{
		this.Author=Author;
		this.Title=Title;
	}

	public void display()
	{
		System.out.println("Author of book and title is: "+Author+Title);
		
	}
	public static void main(String args[])
	{
		Book b1=new Book("A.p.j Abdul Kalam"," Wings of Fire");
		Book b2=new Book("Rabindranath Tagore"," peaceful Warrior");
		b1.display();
		b2.display();

		
	}
	

}
