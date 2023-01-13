package abc;

public class Array {

	public static void main(String[] args) {
		
		int []a=new int[9];{
			a[0]= 200;
			a[1]= 300;
			a[2]= 400;
			a[3]= 2300;
			a[4]= 400;
			a[5]= 600;
			a[6]= 500;
			a[7]= 868;
			a[8]= 700;
			System.out.print("Array size ");
			System.out.println(a.length);
			int sum=0;
			for(int i=0; i<=8; i++) {
				sum=sum+a[8];
				System.out.println(a[i]);
			}
			System.out.print("= ");
			System.out.println(sum);
		}

	}

}
