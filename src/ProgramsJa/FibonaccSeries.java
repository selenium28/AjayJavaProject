package ProgramsJa;

public class FibonaccSeries {

	public static void main(String[] args) {
//		int a=10, b=20;
//		a=a+b;
//		b=a-b;
//		a=a-b;          Swap Two no
//		
//		System.out.println("a:"+a);
//		System.out.println("b:"+b);
//     
		int a=0, b=1;          //Previous two terms:- ex. 0 1 1 2 3 5 8 13
		int c;
		for(int i=1; i<=10; i++) {
			 c=a+b;
			 System.out.println(c);
			 a=b;
			 b=c;
			 
		}
	}

}
