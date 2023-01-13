package basic;

public class StarPattern {
public static void main (String args[]) {
	for(int a=1; a<10; a++) {
		for(int s=10; s>a; s--) {
			System.out.print(" **");
		}
		System.out.println();
	}
	for(int p=1; p<10; p++) {
		for(int o=10; o>p; o--) {
			System.out.print(" **");
		}
		System.out.println();
	}
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
