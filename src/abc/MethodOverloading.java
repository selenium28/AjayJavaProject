package abc;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.Selenium(55);
		obj.Selenium(22, 36);
		obj.Selenium(552, 'A');
		obj.Selenium('D', 'D');
		obj.Selenium(66.34, 'F');
		obj.Selenium(22.22, 33.33);
		obj.Selenium(98, 'C');
		obj.Selenium(77, 55.55, 'R');
	}
public void Selenium(int a) {
	System.out.print("Selenium- ");
	System.out.println(a);
}
public void Selenium(int s, int d) {
	System.out.print("Selenium- ");
	System.out.println(s+d);
}
public void Selenium(int f,char g) {
	System.out.print("Selenium- ");
	System.out.println(f+g);
	
}
public void Selenium(char h, char j) {
	System.out.print("Selenium- ");
	System.out.println(h+j);
	
}
public void Selenium(int k, double l) {
	System.out.print("Selenium- ");
	System.out.println(k+l);
	
}
public void Selenium(double z, double x) {
	System.out.print("Selenium- ");
	System.out.println(z+x);
	
}
public void Selenium(double c, char v) {
	System.out.print("Selenium- ");
	System.out.println(c+v);
}
public void Selenium(int b, double m,char n) {
	System.out.print("Selenium- ");
	System.out.println(b+m+n);
}
}
