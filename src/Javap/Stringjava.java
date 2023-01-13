package Javap;

public class Stringjava {

	public static void main(String[] args) {
				String str = new String("Ajay");
				String str2 = new String ("Patil");
				String str3 = new String ("Automation");
				
			System.out.println(str.length());
			System.out.println(str.charAt(2));
			System.out.println(str.codePointCount(2, 4));
			System.out.println(str+200+str2+500+"Aj"+str3);
			System.out.println(str=str3);

		String str5=("It is inHeritance THe pRoperties ");
		int count=0;
		for(int i=0; i<str5.length(); i++) {
			if (Character.isUpperCase(str5.charAt(i))) {
				
			}
		}
		System.out.println("Number of Uppercase letter"+count);
	}


}
