package learningexample.codesamples;

import java.util.*;

//1- Write code to filter duplicate elements from an array and print as a list?
//2- Write code to sort the list of strings using Java collection?
//3- Write a function to reverse a number in Java?
//4- Write a method to check prime no. in Java?
//5- Write a Java program to find out the first two max values from an array?
//6- Write a Java program to find the longest substring from a given string which doesn’t contain any duplicate characters?
//7- Write Java code to get rid of multiple spaces from a string?
//8- Write Java code to identify a number as Palindrome?
//9- Write Java code to swap two numbers without using a temporary variable?
//10- Write a Java program to demonstrate string reverse with and without StringBuffer class?


public class CodeSamples {
	
	public void printListAfterRemovingDuplicates()
	{
		ArrayList<String> initialArray = new ArrayList();
		initialArray.add("One");
		initialArray.add("Two");
		initialArray.add("One");
		initialArray.add("Three");
		initialArray.add("Two");
		
		System.out.println("Initial Array : "+initialArray);
		
		String str;
	
		for(int i=0;i<initialArray.size()-1;i++)
		{
			str=initialArray.get(i);
			for(int j=i+1;j<initialArray.size();j++) {
				if((initialArray.get(j)).equalsIgnoreCase(str))
				{
					initialArray.remove(j);	
				}
			}
		}
		
		System.out.println("After removing duplicates"+initialArray);
		
		
	}
	
	public void removeDuplicateElementFunction()
	{
		ArrayList<Integer> intArray = new ArrayList();
		intArray.add(1);
		intArray.add(2);
		intArray.add(3);
		intArray.add(4);
		intArray.add(2);
		intArray.add(4);
		
		System.out.println("Initial Array :"+intArray);
		
		int intValue;
		
		for(int i=0;i<intArray.size()-1;i++)
		{
			intValue = intArray.get(i);
			for(int j=i+1;j<intArray.size();j++)
			{
				if(intValue==intArray.get(j))
				{
					intArray.remove(j);
					
				}
			}
		}
		
		System.out.println("After removing duplicates :"+intArray);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CodeSamples cObj = new CodeSamples();
		
		cObj.printListAfterRemovingDuplicates();
		
		cObj.removeDuplicateElementFunction();
		
		
		
		
	}

}
