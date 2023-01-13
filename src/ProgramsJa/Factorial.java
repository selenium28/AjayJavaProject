package ProgramsJa;


public class Factorial {

	public static void main(String[] args) {
		
		int no=24;
		int fact=1;
		for(int i=1; i<=no;i++) {
			fact =fact*i;
			System.out.println("Factorial of "+no+" is \n"+fact);
		}

	}

}
