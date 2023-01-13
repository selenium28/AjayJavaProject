package oops;

public class Incapsul {
public String name;
public int mob;
public int dob;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public int getBom() {
	return mob;
}

public void setBom(int bom) {
	this.mob = bom;
}

public int getDob() {
	return dob;
}

public void setDob(int dob) {
	this.dob = dob;
}
public static void main (String args[]) {
	Incapsul obj = new Incapsul();
	obj.setName("ajay");
	obj.setBom(98501987);
	obj.setDob(25042000);
	System.out.println(obj.getName());
	System.out.println(obj.getBom());
	System.out.println(obj.getDob());
}
}
