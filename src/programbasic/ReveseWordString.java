package programbasic;

public class ReveseWordString {
  
	public static void main(String[] args) {
		
		String s= "my name is ajay";
		String p="";
		String a[]=s.split(s);
		for(int i=s.length()-1;i>0;i--) {
			p=p+a;
		}
		System.out.println(p);

	}
     

}
