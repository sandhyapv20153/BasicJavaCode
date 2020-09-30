package learningexample.collections;

import java.util.*;

public class CollectionPrgs {

	public void ListUsingArrayListFunction() {
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
		System.out.println("******* ArrayList started *******");
		while(itr.hasNext())
		{
			str = itr.next().toString();
			System.out.println(str);
		}
		System.out.println("The third element of the arraylist is :"+array.get(2));
		System.out.println("The size of the arraylist is :"+array.size());
		System.out.println("******* ArrayList Ended *******\n");
		
		
	}
	
	public void ListUsingLinkedListFunction() {
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
		System.out.println("******* LinkedList started *******");
		while(itr.hasNext())
		{
			str = itr.next().toString();
			System.out.println(str);
		}
		System.out.println("The third element of the linkedlist is :"+list.get(2));
		System.out.println("The size of the linkedlist is :"+list.size());
		System.out.println("******* LinkedList Ended *******\n");
		
	}
	
	public void ArrayListFunction()
	{
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(10);
		arrList.add(20);
		arrList.add(30);
		Iterator itr = arrList.iterator();
		System.out.println("************* ArrayList started *************");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("************* ArrayList ended *************\n");
	}
	
	public void QueueUsingLinkedList()
	{
		Queue<String> q = new LinkedList<String>();
		q.add("One");
		q.add("Two");
		q.add("Three");
		q.add("Four");
		System.out.println("************* queue using LinkedList started *************");
		System.out.println("The size of the queue is :"+q.size());
		Iterator itr= q.iterator();
		String str;
		System.out.println("****queue using LinkedList Iteration started ****");
		while(itr.hasNext())
		{
			str = itr.next().toString();
			System.out.println(str);
		}		
		System.out.println("****queue using LinkedList Iteration ended ****");
		q.remove(3);//this does not work
		q.remove("Three");
		itr=q.iterator();
		System.out.println("***queue using LinkedList Iteration after remove***");
		while(itr.hasNext())
		{
			str = itr.next().toString();
			System.out.println(str);
		}		
		System.out.println("The head of the queue before poll is :"+q.poll());
		System.out.println("The head of the queue after poll is :"+q.peek());
		System.out.println("The size of the queue is :"+q.size());
		System.out.println("******* queue using LinkedList Iteration ended *******\n");
		
	}
	
	public void HashMapFunction()//HashMap is not threadsafe but it allows null value
	{
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(01, "One");
		map.put(02, "Two");
		System.out.println("the hashmap..."+map.get(02));
		System.out.println("************* HasMap started *************");
		Set<Integer> keys = map.keySet();
		for(Integer key: keys) {
			System.out.println("Key:"+key+"Values:"+map.get(key));
		}
		System.out.println("************* HasMap ended *************\n");
		
	}
	
	public void HashTableFunction()//Hashtable is threadsafe and it does not allow null value
	{
		Hashtable<Integer,String> table = new Hashtable<Integer,String>();
		table.put(01, "One");
		table.put(02, "Two");
		table.put(03, "Three");
		table.put(04, "Four");
		System.out.println("************* Hashtable started *************");
		System.out.println("the hastable.."+table.get(01));
		Set<Integer> keys = table.keySet();
		for(Integer key:keys) {
			System.out.println("The Key:"+key+"\tValue:"+table.get(key));
		}
		System.out.println("************* Hashtable ended *************");
		

		
	}
	
	
	public static void main(String[] args)
	{
		CollectionPrgs obj = new CollectionPrgs ();
		obj.ListUsingArrayListFunction();
		obj.ListUsingLinkedListFunction();
		obj.QueueUsingLinkedList();
		obj.HashMapFunction();
		obj.HashTableFunction();
		obj.ArrayListFunction();


	}

}
