package learningexample.methodoverriding;

//Polymorphism is defined as the same code giving different behaviours
//Dynamic polymorphism is achieved by method overriding.
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
