package practiced;

public class GlobalAndLocalVeriables {
       int p = 100;
       static String str = "Selenium";
	public static void main(String[] args) {
		 GlobalAndLocalVeriables obj = new  GlobalAndLocalVeriables ();
		obj.display();
		System.out.println();
	}
public void display() {
	System.out.println("Display");
}
public void demo() {
	int j = 200;
	int k = 300;
	int q = j+k+p;
	System.out.println(q);
}
public static void nexon() {
	int m = 40;
	int l = 30;
	 int x = m+l;
	 System.out.println(m);
	 
}
}
