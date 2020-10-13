package learningexample.wrappers;

import java.util.ArrayList;

//
public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Wrappers are classes whose objects hold primitive data type.
		//Autoxing - conversion of primitive types to object of their corresponding wrapper class.
		
		
		int intV = 5;
		Integer myIntV = intV; //Autoboxing - primitive type int to Integer object
		System.out.println(myIntV.intValue());
		
		
		double doubleV = 5.66;
		Double myDoubleV = doubleV; //Autoboxing - primitive type double to Double object
		System.out.println(myDoubleV.doubleValue());
		
		
		char charV='M';
		Character myCharV = charV; //Autoboxing - primitive type char to Character object.		
		System.out.println(myCharV.charValue());
		

		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(25); //Autoboxing - ArrayList only stores object
		System.out.println(arrList.get(0));
		
		
	}

}
