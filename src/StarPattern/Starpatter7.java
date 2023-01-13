package StarPattern;

public class Starpatter7 {
	public static void main (String args[]) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("  **");
			}
			System.out.println();
		}
		for(int a=1; a<=5; a++) {
			for(int s=5;s>=a;s--) {
				System.out.print("  **");
			}
			System.out.println();
		}



		for(int w=1;w<=10;w++) {
			for(int q=9; q>=w;q--) {
				System.out.print(" ");
			}
			for(int z=1;z<=w;z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int d=1;d<=10; d++) {
			for(int k=3;k<=d; k++) {
				System.out.print(" ");
			}
			for(int u=11;u>=d;u--) {
				for(int r=0;r>=u;r--) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		String str = "Ajay\n";
		String sum = (" ");
		for(int o=-1+str.length(); o>=0;o--) {
			sum=sum+str.charAt(o);
		}
		System.out.println(str+sum);
	}
}


