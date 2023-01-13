package ProgramsJa;

public class ReversString {

	public static void main(String[] args) {
		String s="My name is ajay";
		String rev="";
		for(int i=s.length(); i>=1;i--) {
			rev=rev+s.charAt(i);

		}
		System.out.println(rev);

	}

}
