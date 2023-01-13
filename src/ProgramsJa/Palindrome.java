package ProgramsJa;

public class Palindrome {
 public static void main(String args[]) {
	 String s="mam";
	 String rev="";
	 for(int i=s.length()-1;i>=0;i--) {
		 rev=rev+s.charAt(i);
		 
	 }
	 if (s.equals(rev)) {
		System.out.println("it's Palindrome number ");
	} else {
		System.out.println("it's palindrome number not");

	}
 }
}
