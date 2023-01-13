package JavaProject;

public class StaticNonstatic {
	public static int a=200;
	int s=300;

	public static void main(String[] args) {
		StaticNonstatic obj = new StaticNonstatic();
		obj.Display();
		System.out.println("selenium"+obj.Selenium(388, 388));
		System.out.println("Sleep"+obj.sleep(200, 200));
		Nexon(200, 400);

	}
public void Display() {
	System.out.println("Display");
}
public int sleep(int q, int e) {
	int y=q+e+a;
	return y;
}
public static void Nexon(int r, int t) {
	System.out.println("Nexon");
	System.out.println(r+t);
}
public int Selenium(int p,int o) {
	int l=p+o+s;
	return l;
}
}
