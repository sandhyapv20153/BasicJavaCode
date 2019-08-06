package learningexample.exceptions;

import java.util.*;

public class ExceptionHandling {
	
	public int readNumber()
	{
		int x=0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Number:");
		try {
			x = keyboard.nextInt();
			System.out.println("You typed in :"+x);
		} catch (Exception e) {
			System.out.println("Please enter a number");
		}
		return x;
	}
	
	public static void returnStringNTimes(int n) throws Exception
	{
			if (n<10)
				throw new Exception("N must be a positive number");
			for(int i=0;i<n;i++)
			{
				System.out.println("Hello ");
				i++;
			}
	}

	public static void main(String[] args) {
		
		ExceptionHandling exceptionObject = new ExceptionHandling();
		int n=exceptionObject.readNumber();
		try {
			exceptionObject.returnStringNTimes(n);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
