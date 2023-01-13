package basic;

public class Logic {
public static void main (String args[]) {
	
	String str[] = {"Ajay","Gundekar","Encapsulation","Abstraction",};
	for(int i=0; i<4; i++) {
		System.out.println(str[i]);
		//System.out.println("Encapsulation \n Ajay");
	}
	//System.out.println("Encapsulation\nAjay");
	//System.out.println("*\n**\n***\n****\n*****\n******");
	//System.out.println("=================");
	
	for(int j=1; j<7; j++) {
		for(int s=7; s>j; s--) {
			System.out.print("**");
			System.out.print("_______________-");
		}
		System.out.println();
	}
	 for(int j=1; j<12; j++) {
		 for(int s=12; s>j; s--) {
			 System.out.print("**");
		 }
		 System.out.println();
	 }
	
}

}
