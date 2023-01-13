package Practices;

public class Encapsulation {
public String name;
public int  password;
public char id;
public int dob;
public int mob;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPassword() {
	return password;
}
public void setPassword(int password) {
	this.password = password;
}
public int getId() {
	return id;
}
public void setId(char id) {
	this.id = id;
}
public int getDob() {
	return dob;
}
public void setDob(int dob) {
	this.dob = dob;
}
public int getMob() {
	return mob;
}
public void setMob(int mob) {
	this.mob = mob;
}
public static void main(String args[]) {
	Encapsulation objEncapsulation = new Encapsulation();
	objEncapsulation.setName("Ajay gundekar");
	objEncapsulation.setId('v');
	objEncapsulation.setPassword(88648468);
	objEncapsulation.setMob(985636974);
	objEncapsulation.setDob(25042000);
	System.out.println(objEncapsulation.getName());
	System.out.println(objEncapsulation.getId());
	System.out.println(objEncapsulation.getPassword());
	System.out.println(objEncapsulation.getMob());
	System.out.println(objEncapsulation.getDob());
	
}
}
