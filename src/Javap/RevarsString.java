package Javap;

public class RevarsString {

	public static void main(String[] args) {
		String str=("My Name is Ajay Gundekar\n");
		int i=str.length();
		String sum=" ";
		for(int s=i-1; s>=0; s--) {
			sum=sum+str.charAt(s);
		}
		System.out.println(str+sum);

	}

}
