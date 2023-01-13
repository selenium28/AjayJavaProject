package StarPattern;

public class StarPattern6 {

	public static void main(String[] args) {
            String str= new String ("Selenium");
            String str2= new String ("Manualtesting");
             System.out.println(str.contains(str2));
             System.out.println(str.equalsIgnoreCase(str2));
             
             String str3=("Colletion");
             String str4=("Cottage");
             
             System.out.println(str3+22+str4);
             System.out.println(str3.indexOf("io"));
             System.out.println(str3.length());
             System.out.println(str.regionMatches(1, str4, 2, 3));
	}

}
