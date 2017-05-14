package learningexample.methodoverloading;

public class OverLoading {
	
	private int run()
	{
		System.out.println("Function which has no paramters is running");
		return 0;
	}
	
	private int run(int first, int second)
	{
		System.out.println("Function which has int paramters is running");
		return 1;
	}
	
	private int run(int first, String second)
	{
		System.out.println("Function which has two paramters( int, String) is running");
		return 2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoading obj = new OverLoading();
		
		System.out.println(obj.run());
		System.out.println(obj.run(1,2));
		System.out.println(obj.run(1,"two"));

	}

}
