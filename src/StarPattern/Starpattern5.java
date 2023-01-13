package StarPattern;

public class Starpattern5 {

	public static void main(String[] args) {
		for(int a=1; a<=10; a++) {
			for(int s=10; s>=a; s--) {
				System.out.print(" **");
			}
			for(int d=1; d<=a; d++) {
				
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int f=10; f>=1; f--) {
			for(int g=1; g<=f; g++){
				System.out.print(" **");
			}
			System.out.println();
		}
           System.out.print(" ");
	}

}
