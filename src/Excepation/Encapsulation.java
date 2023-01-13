package Excepation;

public class Encapsulation {
	public static void main(String args[]) {
		Encapsulation obj = new Encapsulation();
		obj.setProjectName("SNP");
		obj.setPassword(66644477);
		obj.setHomepage('D');
		obj.setDob(26081999);
		obj.setDate(02102022);
		obj.setParsents(88.99);
		obj.setSeccessful(true);
		
		System.out.println("projectName:- "+obj.getProjectName());
		System.out.println("Password:- "+obj.getPassword());
		System.out.println("HomePage:- "+obj.getHomepage());
		System.out.println("Parsents:- "+obj.getParsents());
		System.out.println("Dob:- "+obj.getDob());
		System.out.println("Date:- "+obj.getDate());
		System.out.println("Successful");
	}
private String ProjectName;
private int password;
private char Homepage;
private double parsents;
private int Dob;
private int Date;
private boolean Seccessful;
public String getProjectName() {
	return ProjectName;
}
public void setProjectName(String projectName) {
	ProjectName = projectName;
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
public double getParsents() {
	return parsents;
}
public void setParsents(double parsents) {
	this.parsents = parsents;
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
public boolean isSeccessful() {
	return Seccessful;
}
public void setSeccessful(boolean seccessful) {
	Seccessful = seccessful;
}
}
