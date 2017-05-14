package learningexample.methodoverriding;

public class Car extends Vehicle{
	
	public void run()
	{
		System.out.println("Car is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car cObj = new Car();
		cObj.run();
	}

}
