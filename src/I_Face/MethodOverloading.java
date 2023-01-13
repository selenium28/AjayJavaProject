package I_Face;

public class MethodOverloading {
public static void main(String[]args) {
	MethodOverloading obj= new MethodOverloading();
	
}
public void Selenium() {
	System.out.println("Selenium");
}
public void Selenium(int a) {
	System.out.println("Selenium");
	System.out.println(a);
}
public void Selenium(int q,int w) {
	System.out.println(q+w);
}
public void Selenium(int e,char r) {
	System.out.println(e+r);
}
public void Selenium(char t,int y) {
	System.out.println(t+y);
}
public void Selenium(char u,char i) {
	System.out.println(u+i);
}
public void Selenium(char o,double p) {
	System.out.println(o+p);
}
public void Selenium(double d,double f) {
	System.out.println(d+f);
}
}
