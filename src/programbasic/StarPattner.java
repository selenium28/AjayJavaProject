package programbasic;

public class StarPattner {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int a=5;a>=i;a--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int s=1;s<=5;s++) {
			for(int x=1;x<=s;x++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
