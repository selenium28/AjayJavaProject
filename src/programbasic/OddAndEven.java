package programbasic;

public class OddAndEven {

	public static void main(String[] args) {
		int a []= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		System.out.println("Even no in array");
		for(int i=0;i<a.length;i++) {
			if (a[i]%2==0) {
				System.out.println(a[i]);
			}
			
		}
		System.out.println("Odd no in array");
		for(int s=0;s<a.length;s++) {
			if (a[s]%2!=0) {
				System.out.println(a[s]);
			}
		}

	}

}
