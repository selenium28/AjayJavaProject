package ProgramsJa;

import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter any no");
		Scanner r = new Scanner(System.in);
		n=r.nextInt();
		if (n%2==0) {
			System.out.println("No is even ");
		} else {
			System.out.println("No is odd");

		}

	}

}
