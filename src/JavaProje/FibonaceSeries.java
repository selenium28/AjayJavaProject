package JavaProje;

public class FibonaceSeries {

	public static void main(String[] args) {
		int a=0, b=10;
		int c;
		for(int i=1; i<=5; i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
       int no=7;
       int sum=1;
       for(int s=1; s<=no;s++) {
    	   sum=sum*s;
    	  
       }
       System.out.println("Sum of "+no+" is "+sum);
	}

}
