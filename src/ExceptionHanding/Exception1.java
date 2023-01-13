package ExceptionHanding;

public class Exception1 {
public static void main(String[]args) {
	int a=0;
	int b=10;
	
	try {
		System.out.println(b/a);
	} catch (ArithmeticException e) {
		System.out.println("Exception Handled");
		System.out.println(e.toString());
		System.out.println(e.getMessage());
	}
	System.out.println("Exception");
}
}
