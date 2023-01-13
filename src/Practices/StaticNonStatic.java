package Practices;

public class StaticNonStatic {
       static int a=50;
       int b = 50;
	public static void main(String[] args) {
		StaticNonStatic obj = new StaticNonStatic();
		obj.Display();
		System.out.println("Sleep"+obj.Sleep(545, 325));
		System.out.println("cat"+obj.cat(200, 200));
		mouse();

	}
	
	public void Display() {
		System.out.println("disaply");
	}
public int Sleep(int s, int d) {

	
	return s+d;
}
public int cat(int f, int k) {
	
	return f+a+b;
}
public static void mouse() {
	System.out.println("Mouse");
}
}
