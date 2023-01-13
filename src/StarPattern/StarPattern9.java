package StarPattern;

public class StarPattern9 {

	public static void main(String[] args) {
		for(int a=1;a<=5; a++) {
			for(int i=1; i<=a; i++) {
				if (a>=2 && i<=1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
