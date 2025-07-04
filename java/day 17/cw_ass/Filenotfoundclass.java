package day17;
import java.io.*;

import java.io.BufferedReader;

import java.io.FileReader;

public class Filenotfoundclass {

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
		catch(FileNotFoundException e)
	   {
		System.out.println("error:"e.getmessage);
		// TODO Auto-generated method stub

	    }
		
	}

}
