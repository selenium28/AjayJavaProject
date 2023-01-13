package ProgramsJa;

public class ArrayEven {

	public static void main(String[] args) {
		int s []= {22,32,34,23};
		System.out.println("even no in array");
		for(int i=0; i<s.length;i++) {
			if (s[i]%2==0) {
				System.out.println(s[i]);
			}
		}
        System.out.println("Odd no in array");
        for(int a=0;a<s.length;a++) {
        	if (s[a]%2!=0) {
				System.out.println(s[a]);
			}
        }
	}

}
