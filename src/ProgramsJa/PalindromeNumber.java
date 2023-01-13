package ProgramsJa;

public class PalindromeNumber {
	public static void main(String args[]) {

		int no=121;
		int temt=no;
		int rev=0,rem;
		while (temt!=0) {
			rem=temt%10;
			rev=rev*10+rem;
			temt=temt/10;
		}
		if (no==rev) {
			System.out.println(no+" Is palindrome number");
		} else {
			System.out.println(no+" Is not palindrome number");

		}
//		int r,sum=0,temp;    
//		int n=454;//It is the number variable to be checked for palindrome  
//
//		temp=n;    
//		while(n>0){    
//			r=n%10;  //getting remainder  
//			sum=(sum*10)+r;    
//			n=n/10;    
//		}    
//		if(temp==sum)  {  
//			System.out.println(n+" palindrome number ");    
//		}else {    
//			System.out.println(n+" not palindrome");    
//		} 
//		{
//		}

	}
}
