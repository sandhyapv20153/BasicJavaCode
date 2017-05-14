package learningexample.abtractandinterface;

public class ChildClass extends TestAbstract implements TestInterface{
	
	public void testFunc2()
	{
		System.out.println("In child class - abstract method implementation");
	}
	
	public void func1()
	{
		System.out.println("In child class - interface method implentation");
	}

	public void func2()
	{
		System.out.println("In child class - interface method implentation");
	}
	

}
