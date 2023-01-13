package practiced;

public class StringConcatonation {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		
		String str = " Ajay ";
		String str2 = "selenium";
      
		System.out.println(a+str+b);
		System.out.println(b+str2+str+a);
		
		System.out.println(str+str2+a+b);
		System.out.println(str2.replace("ajay", str));
	}

}
