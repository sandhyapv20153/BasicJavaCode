package learningexample.stringandstringbuffer;

//String object is immutable
//StringBUffer object can be modified

public class StringAndStringBuffer {
	
	public void stringMethod()
	{
		String str1 = new String("test"); //creates a new object value in memory.
		String strConcat = str1.concat(" parameter"); // creates a new object 
		String str2 = "value";//String value is created in memory
		String str3 = "value";//the same value in memory is referenced by str3
		
	}
	
	public void stringBufferMethod()
	{
		StringBuffer str1 = new StringBuffer("Test");
		StringBuffer str2 = str1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringAndStringBuffer strObj = new StringAndStringBuffer();
		strObj.stringMethod();
		strObj.stringBufferMethod();

	}

}
