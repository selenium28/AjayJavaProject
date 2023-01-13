package string;

public class String5 {

	public static void main(String[] args) {
		String str = new String ("Ajay");
		String str2 = new String ("Ajay");
		
		System.out.println(str==str2);
		System.out.println(str.equals(str2));

		String str3 = ("ajay");
		String str4 = ("gundekar");
		
		System.out.println(str3==str4);
		System.out.println(str3.concat(str4));
		System.out.println(str3+str4);
		System.out.println(str3+20);
		System.out.println(String.join("@", str3,str4));
		System.out.println(str4.substring(4));
	}

}
