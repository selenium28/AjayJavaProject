package JavaProject;

public class Array {

	public static void main(String[] args) {
		String []str = new String [7]; {
				str[0] = ("Ajay");
				str[1] = ("Encapsulation");
				str[2] = ("Inheritance");
				str[3] = ("Polymorphism");
				str[4] = ("Abstraction");
				str[5] = ("Constroctor");
				str[6] = ("Array");
				System.out.println(str.length);
				
				for(int a=6; a>=0; a--) {
					System.out.println(str[a]);
				}
		}

	}

}
