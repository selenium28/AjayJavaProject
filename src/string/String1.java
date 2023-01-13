package string;

public class String1 {

	public static void main(String[] args) {
		String str = new String("AjayGundekar");
		String str2 = new String ("Ajay");
		
		
		
		
		String str3 = "Gundekar";
		String str4=str3.concat(" Ajay");
		
		System.out.println(str.substring(4));
		System.out.println(str.equals(str2));
		System.out.println(str.subSequence(2, 9));
		System.out.println(str4);
		
		
		System.out.println(str3==str4);
		System.out.println(str3.equalsIgnoreCase(str4));
	}

}
