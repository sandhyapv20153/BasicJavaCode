package learningexample.filereadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	
	public void readPropertyFile()
	{
		try{
			System.out.println("\nRead from property file..............");
			String basePath = new File("").getAbsolutePath();
		    String relativePath = basePath.concat("\\docs\\testProperty.properties");
		    
		    
			File file = new File(relativePath);
			FileInputStream fileIStream = new FileInputStream(file);
			Properties prop= new Properties();
			prop.load(fileIStream);
			fileIStream.close();
			System.out.println(prop.getProperty("key1"));
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadPropertyFile obj = new ReadPropertyFile();
		obj.readPropertyFile();

	}

}
