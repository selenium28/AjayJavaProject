package programbasic;

public class PalindromeNumber {

	public static void main(String[] args) {
		String s="1143";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}
		if (s.equals(rev)) {
			System.out.println("Palindrome number");
		} else {
			System.out.println("Palindrome not number");

		}

	}

}
