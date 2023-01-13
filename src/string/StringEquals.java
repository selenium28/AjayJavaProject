package string;

public class StringEquals {

	public static void main(String[] args) {
	
		String s1 = new String ("Ajay");  // 2-object will be created
		String s2 = new String("ajay");  // 2-object will be created 
		
		
		String s3 = "Ajay"; //1-object will be created
		String s4 = "Ajay"; //1-object will be createdS
	    
	    System.out.println(s1==s2);   //
	    System.out.println(s1.equals(s2)); //
	    
	    System.out.println(s3==s4); //
	    System.out.println(s3.equals(s4)); //
	    
	}

}
