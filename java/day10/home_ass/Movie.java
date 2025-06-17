package day10;

public class Movie 
{
	String Title;
	String director;
	int rel;
	Movie(String Title,String director,int rel)
	{
		this.Title=Title;
		this.director=director;
		this.rel=rel;
	}
	public void show()
	{
		System.out.println("movies title is:"+Title);
		System.out.println("director is:"+director);
		System.out.println("release year is"+rel);
	}

	public static void main(String[] args) 
	{
		Movie m1=new Movie("Jab We met","Imtiaz Ali",2007);
		Movie m2=new Movie("Venom","Ruben Flieischer",2024);
		m1.show();
		m2.show();

	}

}
