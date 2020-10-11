package learningexample.exceptions;

public class ExceptionHandling2 {
	
	public String dayOfWeek(int index)
	{
		if(index<0 || index >6)
			throw new IllegalArgumentException("Bad index "+index);
		String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		return days[index];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionHandling2 obj = new ExceptionHandling2();
		String str;
		try
		{
			str=obj.dayOfWeek(-2);
			System.out.println("The day of the week "+str);
			str=obj.dayOfWeek(0);
			System.out.println("The day of the week "+str);
			
		}catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			
			System.out.println("Finished. Thank you!!");
		}

	}

}
