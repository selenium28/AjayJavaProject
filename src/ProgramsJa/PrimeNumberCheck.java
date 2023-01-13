package ProgramsJa;

public class PrimeNumberCheck {
	public static void main(String args[]) {

		int no =10;
		int temt=0;
		for(int i=2;i<=no-1;i++) {
			if (no%i==0) {
				temt=temt+1;
			}
		}
		if (temt==0) {
			System.out.println("Is prime number");
		} else {
			System.out.println("Is prime Number not");

		}
	}

}

