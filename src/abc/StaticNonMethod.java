package abc;

public class StaticNonMethod {
         static int a=200;
         int s=300;
	public static void main(String[] args) {
		StaticNonMethod obj = new StaticNonMethod();
		obj.Display();
		obj.House();
		Javaproject();
		System.out.println("Table"+obj.Table(100, 100));
		System.out.println("Mouse"+obj.Mouse(200, 200));
	    

	}
public void Display() {
	System.out.println("Display");
}
public int Table(int q,int w) {
	int r=q+w+s;
	return r;
}
public static void Javaproject() {
	System.out.println("Java-\n-project");
}
public  int Mouse(int t, int y) {
	int p=t+y+a;
	return p;
}
public void House() {
	int m=300;
	int l=400;
	System.out.println("House");
	int j=m+l;
	System.out.println(j);
}
}
