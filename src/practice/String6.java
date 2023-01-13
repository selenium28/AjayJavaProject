package practice;

public class String6 {

	public static void main(String[] args) {
		String str = new String ("Ajay");
		String str2 = new String (" selenium");
       
		System.out.println(str==str2);
		System.out.println(str.equals(str2));
		System.out.println(str+str2);
		System.out.println(str.concat(str2));
		
		String str3 = "java";
		String str4 = "project";
		
		System.out.println(str.equals(str4));
		System.out.println(str+10+str3+200+str4);
				
	}

}
