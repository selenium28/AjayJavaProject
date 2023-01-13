package StarPattern;

public class Star {
	public static void main(String args[]) {
		for(int a=1; a<=4; a++) {
			for(int s=4; s>=a; s--) {
				System.out.print(" ");
			}
			for(int d=1; d<=a; d++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
