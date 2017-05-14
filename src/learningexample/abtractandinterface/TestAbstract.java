package learningexample.abtractandinterface;

public abstract class TestAbstract {
	
	//When user wants to create a class hierarchy but does not want the base class to do anything, then abstract class is created.
	//
	//An Abstract method can have abstract method or non-abstract method. The abstract method does not have a body.
	//A child class can have only one abstract class as extend can be used only once. A child class should provide implementation to all abstract methods of the abstract class.
	//A child class can implement multiple interfaces.
	//An abstract class cannot be instantiated
	
	int x,y;
	
	public void testFunc1()
	{
		System.out.println("Function in abstract class");
	}
	
	public abstract void testFunc2();


}
