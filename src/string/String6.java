package string;

public class String6 {

	public static void main(String[] args) {
		String s1 = new String ("tejashavini");
		String s2 = new String ("Anuradh");
		
		System.out.println(s1+s2);
		System.out.println(s1.contains(s2));
		System.out.println(s1.codePointAt(2));
		
		String s3 = ("Ajay");
		String s4 = ("Gundekar");
		
		System.out.println(s3.lastIndexOf("a"));
		System.out.println(s1+s2+s3+s4);
		System.out.println(s1+29+30+s2+s3+s4);
		System.out.println(s1.substring(4));

	}

}
