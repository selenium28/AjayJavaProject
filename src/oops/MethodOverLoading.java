package oops;

public class MethodOverLoading {

	// MethodOverLoading--> When the method name is same with different input parameters within the same class.
	// Duplicate methods are not allowed
	// Method inside method is not allowed.
	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading();
		obj.display();
		obj.display(10);
		System.out.print("display with 2 para: "+ obj.display(10, 20));
		

	}

	// Zero parameters
	public void display() { 
		
		System.out.println("display zero parameters");
	}

	// One Parameters
	public void display(int a) {
		System.out.println("display one parameters");
		System.out.println(a);
	}

	// two parameters 
	public int display(int m, int n) {
		System.out.println("display two parameters");
		
		return m+n;
		
	}
	
	// one parameter with different datatype
	public void display(double d) {
		System.out.println("display one parameter with different datatype ");
		System.out.println(d);
	}

}
