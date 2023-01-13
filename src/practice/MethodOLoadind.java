package practice;

public class MethodOLoadind {
	                                   //When the method name is same with different input parameters within the same class.
	public static void main(String[] args) {
		MethodOLoadind obj = new MethodOLoadind();
		obj.display();
		obj.display(10);
		System.out.println("display"+ obj.display(20, 20));
		System.out.println("display"+ obj.display(30, 30));
		System.out.println("display"+ obj.display(50, 50));
		System.out.println("display"+ obj.display(40, 40));
		
	}
    public void display() {
    	
    	System.out.println("display");
    }
    
    public int display(int a, int b) {
    	
    	return a+b;
    }
    public void display(int c) {
    	System.out.println(c);
    	
    }
    public int display(char n, int m) {
    	return n+m;
    }
    public void disply(char z, char x) {
    	System.out.println(z+x);
    }
    public void display(int s, double d) {
    	System.out.println(s+d);
    }
}
