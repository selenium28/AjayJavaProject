package ExceptionHanding;

public class Exception {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		//
		//		int c = a/b;
		//		System.out.println(c);



		try {
			int c = a/b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Exception Handled - a/b");
		}


		
		display();

	}

	public static void display() {
		int m =  10;

		System.out.println(m);
	}

}
