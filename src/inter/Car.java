package inter;

public abstract class Car {
	//Partial Abstraction
	//hiding the implementation logic---is called abstraction

	// NO method body	
	public abstract void color();
	public abstract void model();
	//Non-Abstract method
	public static void  desiel() {
		System.out.println("Car class");
	}
}


