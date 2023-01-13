package string;

public class Array {

	public static void main(String[] args) {
	   int s1[] = new int[7];{
		   s1[0] = 400;
		   s1[1] = 200;
		   s1[2] = 300;
		   s1[3] = 500;
		   s1[4] = 600;
		   s1[5] = 700;
		   s1[6] = 800;
		   
		   int sum = 0;
		   for(int i=0; i<=6; i++) {
			   sum=sum+s1[i];
			 
		   }
		   System.out.println(sum);
	   }
	}

}
