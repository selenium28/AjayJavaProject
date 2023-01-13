package oops;

public class Array {

	public static void main(String[] args) {
	
		String []i = new String [7];
		i[0] = ("Ajay");
		i[1] = ("Sanket");
		i[2] = ("vijay");
		i[3] = ("Ganesh");
		i[4] = ("Rahun");
		i[5] = ("krishna");
		i[6] = ("Rohini");
		
		System.out.println(i.length);
        for(int j=6; j< i.length; j-- ) {
        	System.out.println(i[j]);
        }
        
	}

}
