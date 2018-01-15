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
	    
	    //reads unicode characters
		File fhandle = new File(relativePath);
		FileReader fReader = new FileReader(fhandle);
		BufferedReader brFile = new BufferedReader(fReader);//bufferedReader is synchronized. 
		String st;
		while((st=brFile.readLine())!=null)
		{
			System.out.println(st);
		}
		fReader.close();
		brFile.close();
				
	}
	
	public void readUsingFileInputStream() throws IOException
	{
		System.out.println("\nRead file using FileInputStream class..............");
		String basePath = new File("").getAbsolutePath();
	    String relativePath = basePath.concat("\\docs\\testFile.txt");
	    
	    //reads weird characters
	    byte[] b=new byte[1000];
	    StringBuilder sb = new StringBuilder();
	    FileInputStream fStream = new FileInputStream(relativePath);
	    while(fStream.read(b)!=-1)
	    {
	    	sb.append(new String(b));
	    	
	    }
	    fStream.close();
	    System.out.println(sb.toString());
	    
		
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
		scannerHandle.close();
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
		
		try {
			obj.readUsingFileInputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
