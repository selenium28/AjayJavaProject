package string;

public class String3 {

	public static void main(String[] args) {
		String s1 = "Ajay";
		String s2 = " Gundekar ";
		
		System.out.println(s1.indexOf("j"));
		System.out.println(s1.lastIndexOf("a"));
		System.out.println(s1+s2);
		System.out.println(200+200 +s1+s2);
		System.out.println(300-200+23+s1+s2);
		System.out.println(s2.trim());
		System.out.println(s2+10);
		System.out.println(s1.concat(s2));
		System.out.println(String.join(";", s1,s2));
		System.out.println(s2.subSequence(3, 7));
		System.out.println(s2.substring(4));
		System.out.println(s2.substring(2,4));
		System.out.println(s1.replace("A", " "));

		
	}

}
