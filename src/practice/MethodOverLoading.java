package practice;

public class MethodOverLoading {

	public static void main(String[] args) {
		 MethodOverLoading obj = new  MethodOverLoading();
		 obj.display();
		 obj.display(20);
		 System.out.println("display"+ obj.display(40, 20));
		 System.out.println("display"+ obj.display(20, 20));	
	}

	public void display() {
		
		System.out.println("display");
	}
	
	public void display (int a) {
		System.out.println("display one parameters");
		System.out.println(a);
	}
	
	public int display (int s, int d ) {
		
		return s+d;
		
	}
	public void display (char f, int g) {
		
	}
	
}

