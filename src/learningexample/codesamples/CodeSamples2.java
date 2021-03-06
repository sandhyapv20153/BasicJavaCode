package learningexample.codesamples;

import java.util.*;
import java.util.Random;

public class CodeSamples2 {
	
	
	public void thirdHighest(int intArray[])
	{
		int temp=0;
		int arraySize = intArray.length;
		
		for (int i=0;i<arraySize;i++) {
			for(int j=i+1;j<arraySize;j++) {
				if(intArray[i]>intArray[j])
				{
					temp=intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
		
			}
		}
		
		System.out.println("First Highest :"+intArray[arraySize-1]);
		System.out.println("Second Highest :"+intArray[arraySize-2]);
		System.out.println("Third Highest :"+intArray[arraySize-3]);
	}
	
	
	public void removeDuplicates(ArrayList<Integer> list)
	{
		
		for(int i=0; i<list.size();i++)
		{
			for (int j=i+1;j<list.size();j++)
			{
				if(list.get(i)==list.get(j))
				{
					list.remove(j);
				}
			}
		}
		
		System.out.println(list);
		
	}
	
	public void findSecondWord(String originalStr)
	{
		String array[] = originalStr.split(" ");
		System.out.println(array.length);
		
		for (int i=0;i<array.length;i++)
		{
			
			for ( int j=i+1;j<array.length;j++)
			{
				if(array[i].equalsIgnoreCase(array[j]))
				{
					System.out.println("The word "+array[i] +" repeats");
				}
			}
				
		}
			
		
	}
	
	public void oddOrEven(int numArray[])
	{
		for (int i=0;i<numArray.length;i++)
		{
			if(numArray[i]%2==0)
			{
				System.out.println(numArray[i] +" is even");
			}
			else
			{
				System.out.println(numArray[i] +" is odd");
			}
		}
	}
	
	public void checkAnagram(String firstStr, String secondStr)
	{
		boolean isAnagram = false;
		if(firstStr.length() == secondStr.length())
		{
			
			char firstChar[] = firstStr.toLowerCase().toCharArray();
			char secondChar[]= secondStr.toLowerCase().toCharArray();
			
			System.out.println("firstChar:"+ new String(firstChar) +"\tsecondChar:"+new String(secondChar));
			
			Arrays.sort(firstChar);
			Arrays.sort(secondChar);
						
			isAnagram = Arrays.equals(firstChar, secondChar);
			System.out.println("firstChar after sort:"+ new String(firstChar) +"\tsecondChar after sort:"+new String(secondChar));
		}
		
		else
		{
			isAnagram = false;
		}
		
		if(isAnagram)
		{
			System.out.println("The strings are anagram");
		}
		else
		{
			System.out.println("The strings are not anagram");
		}
		
			
	}
	
	
	public void reverseString(String testString)
	{
		int length = testString.length();
		String revStr="";
		
		for(int j=length-1;j>=0;j--)
		{
			revStr = revStr + testString.charAt(j);
		}
		
		System.out.println("The reversed string is :" + revStr);
		System.out.println("The time complexity is : O(" + length +")");
	}
	
	
	public void palindrome(String str)
	{
		int length = str.length();
		String revStr="";
		
		for (int i=length-1;i>=0;i--)
		{
			revStr=revStr + str.charAt(i);
			
		}
		
		if(str.equalsIgnoreCase(revStr))
		{
			System.out.println(str +" is a palindrome");
		}
		
	}
	
	
	public void fizzBuzz()
	{
		for(int i=1;i<=20;i++)
		{
			if((i%3)==0 && (i%5)==0)
			{
				System.out.println(i +"\t fizzBuzz");
			}
			else if ((i%5)==0)
			{
				System.out.println(i +"\t Buzz");
			}
			else if ((i%3)==0)
			{
				System.out.println(i +"\t Fizz");
			}
			else
			{
				System.out.println(i);
			}
			
				
		}
	}
	
	
	public void orderArray()
	{
		Integer intArray[] = new Integer[10];
		Random rand = new Random();
		int temp = 0;
		
		System.out.println("Unsorted numbers ...");
		for (int i=0;i<10;i++)
		{
			intArray[i]=rand.nextInt(100);
			System.out.println(intArray[i]);
		}
		
		for(int i=0;i<10;i++)
		{
			for (int j=i+1;j<10;j++)
			{
				if((intArray[i]%2)==0 && (intArray[j]%2)!=0)
				{
					temp = intArray[i];
					intArray[i]=intArray[j];
					intArray[j]=temp;
				}
			}
		}
		
		System.out.println("Sorted numbers.....");
		for (int i=0;i<10;i++)
		{
			System.out.println(intArray[i]);
		}
		
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CodeSamples2 Obj = new CodeSamples2();
		
		System.out.println("\nFind third highest number...........");
		int intArray[] = {1,9,2,5,4};
		Obj.thirdHighest(intArray);
		
		System.out.println("\nRemove duplicate numbers...........");
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(10);
		list.add(5);
		list.add(20);
		Obj.removeDuplicates(list);
		
		System.out.println("\nFind repeating string...........");
		String originalStr = "Yes No Yes No";
		Obj.findSecondWord(originalStr);
		
		System.out.println("\nOdd or Even...........");
		int numArray[]= {1,2,7,10,55,62};
		Obj.oddOrEven(numArray);
		
		
		System.out.println("\nAnagram...........");
		String firstString = "Cinema";
		String secondString = "Iceman";
		Obj.checkAnagram(firstString,secondString);
		
		
		System.out.println("\nReverse a string...........");
		String testString = "Test";
		Obj.reverseString(testString);
		

		System.out.println("\nPalindrome...........");
		String str = "level";
		Obj.palindrome(str);
		
		System.out.println("\nFizzBuzz problem...........");
		Obj.fizzBuzz();
		
		System.out.println("\nOrder an array by random numbers and then order by odd and even...........");
		Obj.orderArray();
		
	}

}
