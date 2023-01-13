package string;

public class StringReverse {

	public static void main(String[] args) {
		String str =("My Name is Ajay\n");
		int p=str.length();
		String sum=" ";
		for(int i=p-1; i>=0; i--) {
		sum=sum+str.charAt(i);	
		}
		System.out.println(str+sum);
	}
  
}
