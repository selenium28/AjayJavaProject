package JavaBasic;

public class Conctructor {
	Conctructor(int a,int d) {
	  int f=a+d;
	  System.out.println(f);
}
	Conctructor(String name,int k){
	    int s=k;
		System.out.println(name+k);
	}
	public static void main(String args[]) {
		Conctructor obj = new Conctructor(300,873);
		Conctructor obj2 = new Conctructor("Ajay",279);
		
	}
}
