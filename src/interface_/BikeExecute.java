package interface_;

public class BikeExecute {

	public static void main(String[] args) {
		Shine objShine = new Shine();
		objShine.start();
		objShine.stop();
		objShine.helmet();
		objShine.petrol();
		
		// Bike objBike = new Bike();  // can not create object of interface
		
		Bike obj = new Shine();    // dynamic polymorphism
		obj.start();
		obj.stop();
		obj.helmet();
		
	}

}
