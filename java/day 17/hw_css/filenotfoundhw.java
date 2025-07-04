package day17;
import java.io.*;

public class filenotfoundhw {

	public static void main(String[] args) 
	{
		try
		{
			FileReader reader=new FileReader("myfile.txt");
			BufferedReader br=new BufferedReader(reader);
			String line;
			while((line=br.readeLine())!=null)
			{
				System.out.println(line);
			}
			br.close();
			
		}
		catch(IoException e)
		{
			System.out.println("Error :File not found or cannot be read");

		}
		// TODO Auto-generated method stub

	}

}
