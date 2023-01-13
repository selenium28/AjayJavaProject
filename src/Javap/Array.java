package Javap;

public class Array {

	public static void main(String[] args) {
		String str[]=new String[5];
		str[0]=("Automation");
		str[1]=("Manual Testing");
		str[2]=("Selenium");
		str[3]=("Core java");
		str[4]=("smoke testing");
		System.out.println(str.length);
		for(int i=0; i<=4; i++) {
			System.out.println(str[i]);
			System.out.println(i);
		}
		String str2[]= {"I'm ","Ajay ","Gundekar"};
		for(int p=0; p<3; p++) {
			System.out.print(str2[p]);
		}
	}

}
