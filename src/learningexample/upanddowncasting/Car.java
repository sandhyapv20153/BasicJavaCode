package learningexample.upanddowncasting;

public class Car extends Vehicle{
	
	String model;
	int year;
	
	public void run()
	{
		System.out.println("Driving a car");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//UpCasting - TypeCasting of a child object to a parent object. 
		//UpCasting can be done implicitly.
		//Cannot access this -  vObj.model;
		Vehicle vObj = new Car();
		vObj.VehicleType ="Four Wheeler";
		System.out.println("Vehicle type is :"+vObj.VehicleType);
		vObj.run();
		
		
		//DownCasting - TypeCasting of a parent object to child object.
		//DownCasting cannot be done implicitly.
		Car cObj = (Car)vObj;
		cObj.model ="Honda CRV";
		cObj.year = 2018;
		System.out.println(cObj.model);
		System.out.println(cObj.year);
		
		
	
	}

}
