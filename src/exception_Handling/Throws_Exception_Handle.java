package exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Throws_Exception_Handle 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		System.out.println("Main Starts");
		try
		{
			openFile();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("FNFE handled sucessfully");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
			 System.out.println("Main Ends");
	}
	public static void openFile() throws FileNotFoundException
	{
		FileInputStream	fis = FileInputStream("C:\Users\saraa\OneDrive\Desktop\Edit+\Collection12.java");
    }
}
