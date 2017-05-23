package learningexample.collections;

import java.util.ArrayList;
import java.util.*;

public class CollectionPrgs {

	public void ArrayListFunction() {
		// TODO Auto-generated method stub


		List<String> array = new ArrayList<String>();
		array.add("One");
		array.add("Two");
		array.add("Three");
		array.add("four");
		array.add("five");
		array.remove("two");
		array.remove(2);
		Iterator itr = array.iterator();
		String str;
		System.out.println("******* ArrayList Iteration started *******");
		while(itr.hasNext())
		{
			str = itr.next().toString();
			System.out.println(str);
		}
		System.out.println("******* ArrayList Iteration Ended *******");
		System.out.println("The third element of the arraylist is :"+array.get(2));
		System.out.println("The size of the arraylist is :"+array.size());
		
		
	}
	
	public void LinkedListFunction() {
		// TODO Auto-generated method stub

		List<String> list = new LinkedList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		list.remove("Three");
		list.remove(3);
		Iterator itr = list.iterator();
		String str;
		System.out.println("******* ArrayList Iteration started *******");
		while(itr.hasNext())
		{
			str = itr.next().toString();
			System.out.println(str);
		}
		System.out.println("******* ArrayList Iteration Ended *******");
		System.out.println("The third element of the linkedlist is :"+list.get(2));
		System.out.println("The size of the linkedlist is :"+list.size());
		
	}
	
		
	public static void main(String[] args)
	{
		CollectionPrgs obj = new CollectionPrgs ();
		obj.ArrayListFunction();
		obj.LinkedListFunction();


	}

}
