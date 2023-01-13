package JavaBasic;

public class MethodOverLoading {

	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading();
		obj.Selenium(23);
		obj.Selenium('s', 22);
		obj.Selenium('L', 22.33);
		obj.Selenium(37.55, 'w');
		obj.Selenium(37.55, 44.44);
		obj.Selenium(58.77, 44);
		obj.Selenium(27, 'd');
        obj.Selenium(28, 22);
        obj.Selenium(22.22, 'F', 58);
        obj.Selenium(47, 4444, 585);
     
	}
	public void Selenium(int a) {
		System.out.println("MethodOverLoading\nSelenium");
		System.out.println(a);
	}
public void Selenium(int s, int d) {
	System.out.println("MethodOverLoading\nSelenium");
	System.out.println(s+d);
}
public void Selenium(int f,char g) {
	System.out.println("MethodOverLoading\nSelenium");{
		System.out.println(f+g);
	}
}
public void Selenium(char h,int j) {
	System.out.println("MethodOverLoading\nSelenium");{
		System.out.println(h+j);
	}
}
public void Selenium(char k,double l) {
	System.out.println("MethodOverLoading\nSelenium");
	System.out.println(k+l);
}
public void Selenium(double z,char x) {
	System.out.println("MethodOverLoading\nSelenium");
	System.out.println(z+x);
}
public void Selenium(double c, double v) {
	System.out.println("MethodOverLoading\nSelenium");
	System.out.println(c+v);
}
public void Selenium(double b,int n) {
	System.out.println("MethodOverLoading\nSelenium");
	System.out.println(b+n);
}
public void Selenium(double m, char q,int w) {
	System.out.println("MethodOverLoading\nSelenium");
	System.out.println(m+q+w);
}
public void Selenium(int e,int r,int t) {
	System.out.println("MethodOverLoading\nSelenium");
	System.out.println(e+r+t);
}
}
