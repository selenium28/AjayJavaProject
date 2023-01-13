package JavaProje;

public class Encapsulation {
	public static void main(String[]args) {
		Encapsulation obj= new Encapsulation();
		obj.setJavaName("Extraordiary");
		obj.setPassword(2200022);
		obj.setHomepage('A');
		obj.setDob(27092022);
		obj.setDate(23455554);
		obj.setParsents(22.333);
		obj.setProjectName("Craftsmanship");
		
		System.out.println("Javaname:- "+obj.getJavaName());
		System.out.println("Password:- "+obj.getPassword());
		System.out.println("Home=page:- >\b< "+obj.getHomepage());
		System.out.println("Dob:- "+obj.getDob());
		System.out.println("Date:- "+obj.getDate());
		System.out.println("Parsents:- "+obj.getParsents());
		System.out.println("ProjectName:-speeding "+obj.getProjectName());
	}
private String JavaName;
private int password;
private char Homepage;
private int Dob;
private int Date;
private double parsents;
private String projectName;


private String getJavaName() {
	return JavaName;
}
public void setJavaName(String javaName) {
	JavaName = javaName;
}
public int getPassword() {
	return password;
}
public void setPassword(int password) {
	this.password = password;
}
public char getHomepage() {
	return Homepage;
}
public void setHomepage(char homepage) {
	Homepage = homepage;
}
public int getDob() {
	return Dob;
}
public void setDob(int dob) {
	Dob = dob;
}
public int getDate() {
	return Date;
}
public void setDate(int date) {
	Date = date;
}
public double getParsents() {
	return parsents;
}
public void setParsents(double parsents) {
	this.parsents = parsents;
}
public String getProjectName() {
	return projectName;
}
public void setProjectName(String projectName) {
	this.projectName = projectName;
}
}
