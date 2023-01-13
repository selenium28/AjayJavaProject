package interface_;

public class Shine implements Bike{

	@Override
	public void start() {
		System.out.println("Shine - start");
		
	}

	@Override
	public void stop() {
		System.out.println("Shine - stop");
		
	}

	@Override
	public void helmet() {
		System.out.println("Shine - helmet");
		
	}
	
	public void petrol() {
		System.out.println("Shine - petrol");
	}

}
