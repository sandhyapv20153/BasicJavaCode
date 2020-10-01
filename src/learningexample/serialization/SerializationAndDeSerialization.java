package learningexample.serialization;

import java.io.File;
import java.io.Serializable;
import java.io.*;


public class SerializationAndDeSerialization implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String aParam;
	public int bParam;
	
	public SerializationAndDeSerialization(String aValue, int bValue)
	{
		this.aParam = aValue;
		this.bParam = bValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SerializationAndDeSerialization serObj = new SerializationAndDeSerialization("Test Value", 1);
		
		String basePath = new File("").getAbsolutePath();
	    String relativePath = basePath.concat("\\docs\\serFile.txt");
	    
		try
		{
			FileOutputStream fName = new FileOutputStream(relativePath);
			ObjectOutputStream out = new ObjectOutputStream(fName);
			
			out.writeObject(serObj);
			
			out.close();
			fName.close();
			
			System.out.println("Object has been serialized");
			
			
		}catch(Exception e)
		{
			System.out.println("IOException");
		}
		
		
		SerializationAndDeSerialization serObj2 = null;
		
		try
		{
			FileInputStream fileName = new FileInputStream(relativePath);
			ObjectInputStream in = new ObjectInputStream(fileName);
			
			serObj2 = (SerializationAndDeSerialization)in.readObject();
			
			in.close();
			fileName.close();
			
			System.out.println("Object has been deserialized\n");
			System.out.println("aParam :\t"+serObj2.aParam);
			System.out.println("bParam :\t"+serObj2.bParam);

		}catch(Exception e) {
			
		}
		

	}

}
