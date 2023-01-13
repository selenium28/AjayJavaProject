package practice;

public class StaticNonStatic {
	  static int m =10;                  // Global variable
	  int p = 20;

	public static void main(String[] args) {
		StaticNonStatic obj = new StaticNonStatic();
		obj.run();
		obj.display();
		//obj.sleep(20, 20);
		System.out.println(obj.sleep(20,20));
		System.out.println(obj.p);
		System.out.println(obj.k);
		
		 
		
	}
      public void display(){
    	  System.out.println("display");
    	  
      }
     public int sleep(int a, int b) {
    	  int c = a+b;
    	  
    	  
    		return c; 
      }
     public void run(){
    	  System.out.println("run");
    	  System.out.println(p);
      }
     int b =10;
    public  int k =b+m;
    
    
}
