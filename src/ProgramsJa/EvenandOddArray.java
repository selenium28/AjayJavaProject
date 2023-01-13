package ProgramsJa;

public class EvenandOddArray {

	public static void main(String[] args) {
		int a []= {1,2,3,4,5,6,200,5403,};
		System.out.println("Even number in array");
		for(int i=0;i<a.length; i++) {
			if (a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		
		System.out.println("Odd number in array");
		for(int s=0;s<a.length;s++) {
			if (a[s]%2!=0) {
				System.out.println(a[s]);
			}
		}

	}

}
