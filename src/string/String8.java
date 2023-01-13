package string;

public class String8 {

	public static void main(String[] args) {
		String str = new String("Ajay");
		String str2 = new String(" Gundekar");
		
		System.out.println(str+str2);
		System.out.println(str.charAt(2));
		System.out.println(str2.substring(2));
		
		String str6=("Javaproject");
		String str3=("Selenium");
		String str4=("Javaproject");
		String str5=("");
		
		System.out.println(str3.concat(str4));
		System.out.println(str+1000+str2+399+str3+str4);
		System.out.println(str2.length());
		System.out.println(str3.lastIndexOf("n"));
		System.out.println(str4.toUpperCase());
		System.out.println(str5.isEmpty());
		System.out.println(str6.matches(str4));
		System.out.println(str6.intern());
		System.out.println(str.startsWith(str5, 2));
		System.out.println(str4.toCharArray());
		System.out.println(str6.compareToIgnoreCase(str));
		

	}

}
