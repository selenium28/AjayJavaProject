package Javap;

public class Constructor {
	Constructor(int a, int b){
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[]args) {
		Constructor obj = new Constructor(200,300);
		Constructor obj1= new Constructor("Ajay"," Gundekar");
	}
	Constructor(String z,String s){
		String l=z+s;
		System.out.println(l);
	}
	
}
