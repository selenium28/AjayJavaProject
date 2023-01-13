package practiced;

public class MethodNonStaticClass {

	public static void main(String[] args) {
		MethodNonStaticClass obj = new MethodNonStaticClass();
		obj.Car();
		obj.sum();
		obj.Add();
		Selenium();
		System.out.println();

	}
	public void Add() {
		System.out.println("Add");
	}
public static void Selenium() {
	System.out.println("Selenium");
}
public int sum() {
	System.out.println("sum");
	int a = 20;
	int s = 30;
	int d = a+s;
	
	return d;
}
public String Car() {
	System.out.println("Car");
	String f = "Ajay";
	
	return f;
}
}
