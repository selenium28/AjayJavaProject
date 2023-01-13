package ProgramsJa;

import java.util.Scanner;

public class Evenodd {
public static void main (String args[]) {
	int a;
	System.out.println("Enter any Number");
	Scanner s = new Scanner(System.in);
	a=s.nextInt();
	if (a%2==0) {
		System.out.println("No is even");
		
	}else {
		System.out.println("No is odd");
	}
}
}
