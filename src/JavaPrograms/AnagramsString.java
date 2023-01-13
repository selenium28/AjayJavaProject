package JavaPrograms;

import java.util.Arrays;

public class AnagramsString {

	public static void main(String[] args) {

		String x="My Name is Ajay";
		String y="MY NAME IS AJAY";

		x=x.replace(" ", "");
		y=y.replace(" ", "");
		x=x.toLowerCase();
		y=y.toLowerCase();

		char a[]=x.toCharArray();
		char b[]=y.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		boolean result=Arrays.equals(a, b);
		if (result=true) {
			System.out.println("string are anagram");
		} else {
			System.out.println("string are not anagram");

		}

	}

}
