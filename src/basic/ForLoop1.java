package basic;

public class ForLoop1 {

	public static void main(String[] args) {
//		int a= 2;
//		while (a<=20) {
//			//a=a+1;
//			System.out.println(a);
//			a=a+2;
//		}
//		int i=2;
//		while (i<=20) {
//			System.out.println(i);
//			i=i+2;
//		}
//		int p=3;
//		while(p<=30) {
//			System.out.println(p);
//			p=p+3;
//		}
		for(int s=9; s<=90; s++) {
			System.out.println(s);
			s=s+8;
		}
		int d=9;
		while(d<=90) {
			System.out.println(d);
			d=d+9;
		}
		String str[] = {"Ajay","gundekar","beed"};
		for(int z=0; z<3; z++) {
			System.out.println(str[z]);
		}
		for(int x=1; x<=10; x++) {
			for(int c=10; c>=x; c--) {
				System.out.print("**");
				System.out.print("________");
			}
			System.out.println();
		}
		for(int v=1; v<=15; v++) {
			for(int b=15; b>=v; b--) {
				System.out.print("**");
			}
			System.out.println();
		}
	}

}
