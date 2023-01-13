package StarPattern;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0, b=10;
		int c;
       for(int s=1; s<=10; s++) {
    	   c=a+b;
    	   System.out.println(c);
    	   a=b;
    	   b=c;
       }
	}

}
