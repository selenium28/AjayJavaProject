package StarPattern;

public class StarPattern3 {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			for(int j=10; j>=i; j--) {
				System.out.print("  **");
			}
			for(int a=1; a<=i; a++) {
				
				System.out.print(" ");
			}
			System.out.println();
		}
        for(int z=10; z>=1; z--) {
        	for(int n=1; n<=z; n++) {
        		System.out.print("  **");
        	}
        	System.out.println("       ~~~~~~~~~ Flag ~~~~~~~~");
        }
      System.out.print("                                                      Thank You");
	}

}
