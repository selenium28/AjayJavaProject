package programbasic;

public class EvenandOdd {

	public static void main(String[] args) {
		int s[]= {1,2,3,4,5,6,7,8};
		System.out.println("Is Even no array");
		for(int i=0;i<s.length;i++) {
			if (s[i]%2==0) {
				System.out.println(s[i]);
			}
			
		}
		System.out.println("Odd no is array");
		for(int z=0;z<s.length;z++) {
			if (s[z]%2!=0) {
				System.out.println(s[z]);
			}
		}

	}

}
