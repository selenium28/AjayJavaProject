package JavaBasic;

public class Starpattern {

	public static void main(String[] args) {
		for(int d=1; d<10; d++) {
			for(int f=1; f<d; f++) {
				System.out.print("**");
			}
			System.out.println();
		}
		for(int m=1; m<10; m++) {
			for(int n=10; n>m; n--) {
				System.out.print("**");
			}
			System.out.println();
		}
	}
	}