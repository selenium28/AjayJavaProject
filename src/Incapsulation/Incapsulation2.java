package Incapsulation;

public class Incapsulation2 {
public String name;
public int Password;
public char Loing;
public String Homepage;
public int mob;
public int Dob;
public double prasedns;
public boolean Succesfull;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPassword() {
	return Password;
}
public void setPassword(int password) {
	Password = password;
}
public char getLoing() {
	return Loing;
}
public void setLoing(char loing) {
	Loing = loing;
}
public String getHomepage() {
	return Homepage;
}
public void setHomepage(String homepage) {
	Homepage = homepage;
}
public int getMob() {
	return mob;
}
public void setMob(int mob) {
	this.mob = mob;
}
public int getDob() {
	return Dob;
}
public void setDob(int dob) {
	Dob = dob;
}
public double getPrasedns() {
	return prasedns;
}
public void setPrasedns(double prasedns) {
	this.prasedns = prasedns;
}
public boolean isSuccesfull() {
	return Succesfull;
}
public void setSuccesfull(boolean succesfull) {
	Succesfull = succesfull;
}
public static void main (String args[]) {
	Incapsulation2 obj = new Incapsulation2();
	obj.setName("I'm Ajay Gundekar");
	obj.setPassword(10082);
	obj.setLoing('A');
	obj.setHomepage("Incapsulation page");
	obj.setMob(985019712);
	obj.setDob(25042000);
	obj.setPrasedns(71.25);
	obj.setSuccesfull(true);
	
	System.out.println(obj.getName());
	System.out.println(obj.getPassword());
	System.out.println(obj.getLoing());
	System.out.println(obj.getHomepage());
	System.out.println(obj.getMob());
	System.out.println(obj.getDob());
	System.out.println(obj.getPrasedns());
	
	
	
	
}
}
