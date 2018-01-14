package learningexample.filereadwrite;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class ReadWriteFile {
	
	public void readUsingBufferedReader() throws IOException
	{
		System.out.println("\nRead File using BUffered Reader ..............");
		String basePath = new File("").getAbsolutePath();
	    System.out.println(basePath);
	    String relativePath = basePath.concat("\\docs\\testFile.txt");
	    System.out.println(relativePath);
	    

		File fhandle = new File(relativePath);
		FileReader fReader = new FileReader(fhandle);
		BufferedReader brFile = new BufferedReader(fReader);//bufferedReader is synchronized. 
		String st;
		while((st=brFile.readLine())!=null)
		{
			System.out.println(st);
		}
				
	}
	
	public void readUsingScanner() throws FileNotFoundException
	{
		System.out.println("\nRead file using Scanner class..............");
		String basePath = new File("").getAbsolutePath();
	    String relativePath = basePath.concat("\\docs\\testFile.txt");
	    File fileHandle = new File(relativePath);

		Scanner scannerHandle = new Scanner(fileHandle);
		while(scannerHandle.hasNextLine())
		{
			System.out.println(scannerHandle.nextLine());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReadWriteFile obj= new ReadWriteFile();
		
		try {
			obj.readUsingBufferedReader();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		try {
			obj.readUsingScanner();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
