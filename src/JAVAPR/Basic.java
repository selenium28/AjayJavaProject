package JAVAPR;

public class Basic {
public static void main (String[]args) {
	String str="Abhi Lande\n";
	String Rev= " ";
for(int i=str.length()-1; i>=0; i--) {
	Rev=Rev+str.charAt(i);
	
}
System.out.println(str+Rev);
}
}
