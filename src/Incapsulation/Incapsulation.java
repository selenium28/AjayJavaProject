package Incapsulation;

public class Incapsulation {
public String Name;
public char UserID;
public int password;
public char Homepage;
public double present;
public int Mob;
public int Dob;
public int dete;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public char getUserID() {
	return UserID;
}
public void setUserID(char userID) {
	UserID = userID;
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
public double getPresent() {
	return present;
}
public void setPresent(double present) {
	this.present = present;
}
public int getMob() {
	return Mob;
}
public void setMob(int mob) {
	Mob = mob;
}
public int getDob() {
	return Dob;
}
public void setDob(int dob) {
	Dob = dob;
}
public int getDete() {
	return dete;
}
public void setDete(int dete) {
	this.dete = dete;
}
public static void main (String args[]) {
	Incapsulation obj = new Incapsulation();
	obj.setName("Mr-Ajay-Patil");
	obj.setUserID('A');
	obj.setPassword(33337594);
	obj.setHomepage('G');
	obj.setPresent(22.33);
	obj.setMob(985019716);
	obj.setDob(250420000);
	obj.setDete(23082022);
	
	System.out.println(obj.getName());
	System.out.println(obj.getUserID());
	System.out.println(obj.getPassword());
	System.out.println(obj.getHomepage());
	System.out.println(obj.getPresent());
	System.out.println(obj.getMob());
	System.out.println(obj.getDob());
	System.out.println(obj.getDete());
	
}
}
