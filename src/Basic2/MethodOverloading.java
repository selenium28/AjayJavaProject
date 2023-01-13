package Basic2;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj =new MethodOverloading();
		obj.Selenium(22);
		obj.Selenium(555, 366);
		obj.Selenium('E', 44.66);
		obj.Selenium('D', 89889);
		obj.Selenium(22.33, 'L');
		obj.Selenium(66.87, 34.77);
		obj.Selenium(56.77, 3790);
		obj.Selenium(787, 'g');
		obj.Selenium(22222, 53.37);
		obj.Selenium(262, 333);
		obj.Selenium('O', 45454, 22.33);
		obj.Selenium(38.33, 333, 'V');
		

	}
public void Selenium(int a) {
	System.out.println("                 (MethodOverloading)");
	
	System.out.print("Selenium:- ");
	System.out.println(a);
}
public void Selenium(int s,int d) {
	System.out.print("Selenium:- ");
	System.out.println(s+d);
}
public void Selenium(int f,char g) {
	System.out.print("Selenium:- ");
}
public void Selenium(char h,char j) {
	System.out.print("Selenium:- ");
	System.out.println(h+j);
}
public void Selenium(char k,double l) {
	System.out.print("Selenium:- ");
	System.out.println(k+l);
}
public void Selenium(double z,double x) {
	System.out.print("Selenium:- ");
	System.out.println(z+x);
}
public void Selenium(double c,int v) {
	System.out.print("Selenium:- ");
	System.out.println(c+v);
}
public void Selenium(int b,double n) {
	System.out.print("Selenium:- ");
	System.out.println(b+n);
}
public void Selenium(char q,int w) {
	System.out.print("Selenium:- ");
	System.out.println(q+w);
}
public void Selenium(double e,char r) {
	System.out.print("Selenium:- ");
	System.out.println(e+r);
}
public void Selenium(double t,int y,char u) {
	System.out.print("Selenium:- ");
	System.out.println(t+y+u);
}
public void Selenium(char i,int o,double p) {
	System.out.print("Selenium:- ");
	System.out.println(i+o+p);
}
}
