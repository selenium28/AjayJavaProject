package Java;

public class Stringjava {

	public static void main(String[] args) {
	     String str = new String("Ajay");
	     String str2= new String ("Gundekar");
	     
	     System.out.println(str.charAt(3));
	     System.out.println(str2.compareTo(str));
	     
	     String str3=("Selenium");
	     String str4=("selenium");
	     
	     System.out.println(str3==str4);
	     System.out.println(str3.toUpperCase());
	     System.out.println(str3.toLowerCase());
	     System.out.println(str.matches(str4));
	     System.out.println(str3.charAt(3));
	     System.out.println(str.replace("Selenium", str));
	     System.out.println(str4.toCharArray());
	     System.out.println(str3.endsWith(str4));

	}

}
