package string;

public class String2 {

	public static void main(String[] args) {
		String str = new String("Ajay");
		String str2 = new String ("ajay");
        System.out.println(str.equalsIgnoreCase(str2));
		
        String str3 = "Vijay";
        String str4 = "Vijay";
		
	//	System.out.println(str.substring(2));
	//	System.out.println(str.equals(str2));
		
		System.out.println(str3==str4);
		System.out.println(str3.equalsIgnoreCase(str4));
	}

}
