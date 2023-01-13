package Logic;

public class Star {
public static void main(String[]args) {
	for(int a=1; a<=5; a++) {
		for(int s=1; s<=a; s++) {
			System.out.print("  ");
		}
		System.out.println(" **");
	}
	for(int i=1; i<=5; i++) {
		for(int l=5; l>=i; l--) {
			System.out.print("  ");
		}
		System.out.println(" **");
	}
	
}
}
