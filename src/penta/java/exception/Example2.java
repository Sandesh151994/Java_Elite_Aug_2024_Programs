package penta.java.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class CheckedException
{
	void print() throws IOException
	{
		
			throw new IOException();
		
	}
}
public class Example2 {

	public static void main(String[] args)  {

		System.out.println("Source");
		try {
			FileInputStream file=new FileInputStream("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Destination");


	}

}
