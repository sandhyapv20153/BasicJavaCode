package learningexample.codesamples;

import java.util.*;


public class CodeSamples {
	
	//Removes duplicates from a Array of strings and prints them.
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
	
	//Removes duplicates from a Array of integers and prints them.
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
