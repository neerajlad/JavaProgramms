package exceptionHandlingPkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Checked_Example_Main {

	public void display() throws Exception
	{
		FileInputStream fis1 = null;
		/*This constructor FileInputStream(File filename)
		 * throws FileNotFoundException which is a checked
		 * exception*/
	        fis1 = new FileInputStream("B:/myfile.txt");
	}
	
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		/*This constructor FileInputStream(File filename)
		 * throws FileNotFoundException which is a checked
		 * exception*/
	        fis = new FileInputStream("B:/myfile.txt"); 
		int k; 

		/*Method read() of FileInputStream class also throws 
		 * a checked exception: IOException*/
		while(( k = fis.read() ) != -1) 
		{ 
			System.out.print((char)k); 
		} 

		/*The method close() closes the file input stream
		 * It throws IOException*/
		fis.close(); 	
		//Checked_Example_Main c = new Checked_Example_Main();
		//c.display();
	}
	
	
}
