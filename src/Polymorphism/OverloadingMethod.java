package Polymorphism;

public class OverloadingMethod {

	public static void main(String[] args) {
		OverloadingMethod obj = new OverloadingMethod();
		Display();
		obj.Display(24);
		obj.Display(55, 44);
		obj.Display(46, 'A');
		obj.Display('S', 'G');
		obj.Display('Z', 22.34);

	}
public static void Display() {
	System.out.println("Display");
}
public void Display(int a) {
	System.out.println("Book");
	System.out.println(a);
}
public void Display(int d, int f) {
	System.out.println("Selenium");
	System.out.println(d+f);
}
public void Display(int g, char h) {
	System.out.println("Display");
	System.out.println(g+h);
}
public void Display(char j, char k) {
	System.out.println("Display");
	System.out.println(j+k);
}
public void Display(char l, double z) {
	System.out.println("Display");
	System.out.println(l+z);
}
}
