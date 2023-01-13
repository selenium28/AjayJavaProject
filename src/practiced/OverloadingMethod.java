package practiced;

public class OverloadingMethod {

	public static void main(String[] args) {
		OverloadingMethod obj = new OverloadingMethod();
		keyword();
		obj.keyword(234);
		obj.keyword('A', 288);
		obj.keyword(500, 400);
		obj.keyword(24.23, 35.57);
		obj.keyword(true);

	}
    public static void keyword () {
    	System.out.println("keyword");
    }
    public void  keyword (int a ) {
    	System.out.println("keyword");
    	System.out.println(a);
    	
    }
    public void keyword(int s, int f  ) {
    	System.out.println("keyword");
    	System.out.println(s+f);
    }
    public void keyword(char g, int k) {
    	System.out.println("keyword");
    	System.out.println(g+k);
    }
    
    public void keyword(boolean w) {
    	System.out.println("keyword");
    	System.out.println(w);
    }
    public void keyword(double x, double c ) {
    	System.out.println("keyword");
    	System.out.println(x+c);
    }
}
