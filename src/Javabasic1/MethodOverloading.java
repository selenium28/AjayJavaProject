package Javabasic1;

public class MethodOverloading {
public static void main(String args[]) {
	MethodOverloading o = new MethodOverloading();
	Display(23);
	o.Display('S', 's');
	o.Display(22.33, 34.56);
	o.Display(35, 'G');
	o.Display(23, 6734);
	
	
	
}
public static void Display(int a) {
	System.out.println(a);
}
public void Display(int s,int d) {
	System.out.println(s+d);
}
public void Display(int q,char w) {
	System.out.println(q+w);
}
public void Display(char e,char r) {
	System.out.println(e+r);
}
public void Display(double z,double x) {
	System.out.println(z+x);
}
}
