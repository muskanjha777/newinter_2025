package day17;

import java.io.FileReader;
import java.io.IOException;

public class Readnon {

	public static void main(String[] args)
	{
		try
		{
			FileReader reader=new FileReader("non_existing_file.txt");
			reader.read();
			reader.close();
		}
		catch(IOException e)
		{
			System.out.println("IoException occured:"+e.getMessage());
		}
		// TODO Auto-generated method stub

	}

}
