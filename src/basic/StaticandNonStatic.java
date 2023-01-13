package basic;

public class StaticandNonStatic {
     static int a= 200;
     int v= 304;
     
	public static void main(String[] args) {
		
		StaticandNonStatic obj = new StaticandNonStatic();
		obj.Teble();
		System.out.println("Sleep"+obj.sleep(299, 400));
		System.out.println("Apple"+obj.Apple(400, 4788));
		Display();
	

	}
public static void Display() {
	System.out.println("Display");
	int l= 100;
	int p= 500;
	int o=l+p;
	System.out.println(o);
}
public int sleep(int b, int c) {
	
	return b+c;
}
public void Teble() {
	System.out.println("Table");
}
public int Apple(int s, int k) {
	
	return s+k+a+v;
}
}
