package Practices;

public class Methodoverroading {

	public static void main(String[] args) {
		Methodoverroading obj = new Methodoverroading();
		obj.Display();
		System.out.println("Display"+obj.Display(34));
		System.out.println("Display"+obj.Display(200, 478));
		System.out.println("Display"+obj.Display(6464, 364));
		
	}
public void Display() {
	System.out.println("Display");
}

public int Display(int a) {
	
	
	return a; 
}
public int Display(int c,int n) {
	
	return c+n;
}
public int Display(char m, int d) {
	
	return m+d;
}

}
