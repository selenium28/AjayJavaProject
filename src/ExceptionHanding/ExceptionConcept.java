package ExceptionHanding;

public class ExceptionConcept{

	public static void main(String[] args) {
		
		
		final int b;
		
		
		try {
			int a[] = new int[5];
			a[7] = 10/5;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			
		}
		
		System.out.println("Rest code");
		
		try {
			System.out.println("Exception");
		} finally {
			System.out.println("Finally block");
		}
		
		
		try {
			
		} finally {
			// TODO: handle finally clause
		}

	}

}
