package practice;


public class Animal {

	public static void main(String[] args) {

		System.out.println("main Method Ajay");
		Animal obj = new Animal();
		obj.cat();
		dog();
		dog(); 
		//		int sum = obj.sleep(50, 50);
		System.out.println("sleep method Add: "+obj.sleep(50, 50));
		int c=10+10;
		System.out.println(c);
		obj.run();

	}

	public static void dog() {
		System.out.println("dog method");

	}

	public void cat() {
		System.out.println("cat method");

	}

	int sleep(int a, int b) {
		//    	    System.out.println("sleep method");
		int c = a+b;

		return c;
	}

	public String run() {
		String s = "aj";
		System.out.println("run method");

		return s;

	}

}
