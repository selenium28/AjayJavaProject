package JavaProject;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.Display(20);
		obj.Display(200, 800);
		obj.Display(10000, 'D');
		obj.Display('A', 'j');
		obj.Dsipaly('P', 33.55);
		obj.Dsiplay(44.88, 86);
		obj.Display(65.99, 2000);
		obj.Display(77, 'F', 67.00);
		
		

	}
public void Display(int a) {
	System.out.println("Display");
	System.out.println(a);
}
public void Display(int s, int b) {
	System.out.println("Display");
	System.out.println(s+b);
	
}
public void Display(int z,char x) {
	System.out.println("Display");
	System.out.println(z+x);
}
public void Display(char d,char f) {
	System.out.println("Display");
	System.out.println(d+f);
	
}
public void Dsipaly(char p, double i) {
	System.out.println("Display");
	System.out.println(p+i);
}
public void Dsiplay(double u, double y) {
	System.out.println("Dsiplay");
	System.out.println(u+y);
}
public void Display(double t, int r) {
	System.out.println("Display");
	System.out.println(t+r);
}
public void Display(int e, char w, double g ) {
	System.out.println("Display");
	System.out.println(e+w+g);
}
}
