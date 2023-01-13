package Java;

public class GlobleandLocal {
   static String name = "ajay";
   int age=200;
	public static void main(String[] args) {
		GlobleandLocal obj = new GlobleandLocal();
		obj.Display();
		sum();
		int w=500;
		System.out.println("W "+w);
		System.out.println("Name"+GlobleandLocal.name);
		Nexon();
	}
	public static void sum() {
		System.out.println("sum");
		
		
	}
	public void Display() {
		int s=200;
		int d=300;
		int f=s+d;
		System.out.println(f);
	}
	public static  void Nexon() {
		int l=200;
		int k=30;
		int p=l+k;
    	GlobleandLocal obj2 = new GlobleandLocal();
		System.out.println(obj2.age+p);
		
		
	}

}
