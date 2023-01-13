package Stringprogram;

public class StringConcatenation {

	public static void main(String[] args) {
		String str = "Ajay gundekar ";
		String str2 ="  java  ";
		System.out.println(str.concat(str2));
		System.out.println(String.join("ajay",str,str2));
		System.out.println(str.subSequence(2,3));
		System.out.println(str.replace('g', 'G'));
		System.out.println(str2.trim()+str.concat(str2.trim()));
		str.concat(str2);
		System.out.println(str);

	}

}
