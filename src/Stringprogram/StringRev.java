package Stringprogram;

public class StringRev {

	public static void main(String[] args) {
		
		String s="My name is Ajay";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(s+"\n"+rev);

	}

}
