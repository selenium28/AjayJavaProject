package abc;

public class NonStaicMethod {
       static int e=200;
       int p=300000;
       
	public static void main(String[] args) {
		NonStaicMethod obj = new NonStaicMethod();
		Selenium();
		obj.Sleep(77, 88);
		obj.Encapsulation(10000, 2846);
        System.out.println("Table"+obj.Teble(300,100));
	}
public static void Selenium() {
	System.out.println("Selenium");

}
public int Teble(int s, int d) {
	
	int q=s+d;
	return d ;
}
public void Encapsulation(int r,int t) {
	System.out.println("Encapsulation");
	
	int y=r+t+e;
	System.out.println(y);
	
}
public void  Sleep( int l, int k) {
	System.out.println("Sleep");
	int j=l+k+p;
	System.out.println(l);
	
}
}
