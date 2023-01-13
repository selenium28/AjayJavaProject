package ProgramsJa;

import java.util.Scanner;

public class HowtoCheckPalindrome {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter in String ");
		String str=s.next();
		
		String rev="";
		for(int i=str.length()-1; i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if (str.equals(rev)) {
			System.out.println("Is palindroms no");
		} else {
			System.out.println("Is palindromsnot no");

		}
	}

}
