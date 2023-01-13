package Abcd;

public class StringReverse {

	public static void main(String[] args) {
		String str=("My name is Ajay\n");
		int s=str.length();
		String sum=("  ");
		for(int i=s-1; i>=0; i--) {
			sum=sum+str.charAt(i);
		}
		System.out.println(str+sum);
   
	}

}
