package inheri;

//import Excepation.StringJava;

public class ArrayString {

	public static void main(String[] args) {

		String str[]= new String [7];
		str[0]= ("1 I'm Ajay");
		str[1]=("2 last name Gundekar");
		str[2]=("3 Encapsualtion");
		str[3]=("4 Selenium");
		str[4]=("5 Java");
		str[5]=("6 Manuam");
		str[6]=("7 Laptop");
		
		System.out.println();
		System.out.println("String array\n");
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println(" ");
				for(int a=6; a>=0; a--) {
					System.out.println(str[a]);
					System.out.println("-----_---");
				}
				System.out.println(" ");
				String str2[]={"InterFace".replace('S', 'M')+"Abstraction","Encapsulation","Selenium","Manual Testing","Automation Testing"};
				for(int s=0; s<6; s++) {
					//System.out.println(str2[s]);
					System.out.println(str[s]+" :- Logic");
				}
				try { 
					System.out.println(str2);
				} catch (Exception e) {
					System.out.println(e);
				}
				System.out.println("Hello\r\b Ajay");


	}

}
