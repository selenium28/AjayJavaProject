package oops;

public class Incapsulation {
private String name;
private int dub;
private int mob;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getDub() {
	return dub;
}

public void setDub(int dub) {
	this.dub = dub;
}

public int getMob() {
	return mob;
}

public void setMob(int mob) {
	this.mob = mob;
}
public static void main (String args[]) {
	Incapsulation obj = new Incapsulation();
	obj.setName("Ajay");
	obj.setDub(25042000);
	obj.setMob(985019);
	System.out.println(obj.getName());
	System.out.println(obj.getDub());
	System.out.println(obj.getMob());
}
}
