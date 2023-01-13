package Java;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.Selenium();
		obj.Selenium(22);
		obj.Selenium('S', 'A');
		obj.Selenium('e', 22.34);
		obj.Selenium('L', 67);
		obj.Selenium(33.33, 'Q');
		obj.Selenium(33.33, 44.555);
		obj.Selenium(38, 'M');
		obj.Selenium(47, 23);

	}
 public void Selenium() {
	 System.out.println("Selenium");
 }
 public void Selenium(int a) {
	 System.out.println(a);
 }
 public void Selenium(int s,int d) {
	 System.out.println(s+d);
 }
 public void Selenium(int f,char g) {
	 System.out.println(f+g);
 }
 public void Selenium(char h,int j) {
	 System.out.println(h+j);
 }
 public void Selenium(char k,char l) {
	 System.out.println(k+l);
 }
 public void Selenium(char q, double w) {
	 System.out.println(q+w);
 }
 public void Selenium(double e, char r) {
	 System.out.println(e+r);
 }
 public void Selenium(double t,double y) {
	 System.out.println(t+y);
 }
}
