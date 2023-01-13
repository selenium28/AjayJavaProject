package oops;

public class Incapsula {
public String name;
public int mob;
public int dob;
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getMob() {
	return mob;
}

public void setMob(int mob) {
	this.mob = mob;
}

public int getDob() {
	return dob;
}

public void setDob(int dob) {
	this.dob = dob;
}
public static void main (String args[]) {
	Incapsula objIncapsula = new Incapsula();
	objIncapsula.setName("Ajay");
	objIncapsula.setMob(992327933);
	objIncapsula.setDob(25042000);
	System.out.println(objIncapsula.getMob());
	System.out.println(objIncapsula.getMob());
	System.out.println(objIncapsula.getDob());
}
}
