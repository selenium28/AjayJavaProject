package StarPattern;

public class Starpattern7 {

	public static void main(String[] args) {
		for(int a=1; a<=4; a++) {
			for(int s=4;s>=a; s--) {
				System.out.print(" ");
			}
			for(int d=1; d<(a*2); d++) {
				System.out.print("*");
			}
//			for(int f=2;f<=a;f++) {
//				System.out.print("*");
//			}
			System.out.println();
			
		}

	}

}
