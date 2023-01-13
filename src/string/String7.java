package string;


public class String7 {

	public static void main(String[] args) {
		String str = new String ("Duggu ");
		String str1 = new String ("Tarush");
		
		System.out.println(str+str1);
		System.out.println(str==str1);
		
		String str2 = ("Ajay");
		String str3 = ("Gundekar");
		
		System.out.println(str2==str3);
		System.out.println(str2.concat(str3));
		
		System.out.println(str2.substring(2));
		
		
		String str4 = ("Vijay");
		String str5 = ("Rahul");
	    System.out.println(str4.subSequence(1, 3));
	    System.out.println(str.trim()+str1+str2+str3+str4);
	    System.out.println(str.trim());
	    System.out.println(String.join("@",str1+str4 ));

	}

}
