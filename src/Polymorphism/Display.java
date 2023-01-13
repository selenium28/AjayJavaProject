package Polymorphism;

public class Display {

	public static void main(String[] args) {
		Display obj = new Display();
		obj.Display(400);
		obj.Display(200+400);
		obj.Display(109, 'D');
		obj.Display(5000, 23.47);
		obj.Display(44.55, 43, 55);
		obj.Display(true, 'L', 90000, 300.500);

	}
public void Display(int a ) {
	System.out.println("Dispaly");
	System.out.println(a);
}
public void Display(int s, int c) {
	System.out.println("Display");
	System.out.println(s+c);
}
public void Display(int l, char k) {
	System.out.println("Display");
	System.out.println(l+k);
}
public void Display(int q, double o) {
	System.out.println("Dispaly");
	System.out.println(q+o);
}
public void Display(double w, int e, int r) {
	System.out.println("Display");
	System.out.println(w+e+r);
}
public void Display(boolean u, char i, int y, double t) {
	System.out.println("Display");
	System.out.println(i+y+t);
	
}
}
