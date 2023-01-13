package Javabasic1;

public class Encapsulation {
 private String projectname;
 private int password;
 private char Homepage;
 private int DOB;
 private int todayDate;
 private String username;
 private double present;
 
public static void main (String args[] ) {
	Encapsulation obj = new Encapsulation();
	obj.setProjectname("PMKVY");
	obj.setPassword(8333333);
	obj.setHomepage('S');
	obj.setDOB(2507200);
	obj.setTodayDate(22112022);
	obj.setUsername("AJaY");
	obj.setPresent(33.44);
	
	System.out.println("projectname "+obj.getProjectname());
	System.out.println("password "+obj.getPassword());
	System.out.println("HomePage "+obj.getHomepage());
	System.out.println("DOB "+obj.getDOB());
	System.out.println("TodayDate "+obj.getTodayDate());
	System.out.println("UserName "+obj.getUsername());
	System.out.println("Present "+obj.getPresent());
}
 
public String getProjectname() {
	return projectname;
}
public void setProjectname(String projectname) {
	this.projectname = projectname;
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
public int getDOB() {
	return DOB;
}
public void setDOB(int dOB) {
	DOB = dOB;
}
public int getTodayDate() {
	return todayDate;
}
public void setTodayDate(int todayDate) {
	this.todayDate = todayDate;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public double getPresent() {
	return present;
}
public void setPresent(double present) {
	this.present = present;
}
 
}
