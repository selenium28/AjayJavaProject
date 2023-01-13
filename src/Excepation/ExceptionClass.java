package Excepation;

public class ExceptionClass {
public static void main(StringJava args[]) {
	
	int a=10;
	int b[]=new int [4];
	
	
	
	try {
		b[5]= 10/5;
		System.out.println(b[5]);
		//System.out.println(b[3]);
	} catch (Exception e) {
		System.out.println("Excepation Hading");
		e.printStackTrace();
		System.out.println(e.toString());
	}
	System.out.println("login page");
	System.out.println("Selenium");
}
}
