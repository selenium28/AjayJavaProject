package oops;

public class Incapsu {
 public String Ajay;
 public int mob;
 public int dob;
public String getAjay() {
	return Ajay;
}
public void setAjay(String ajay) {
	Ajay = ajay;
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
	Incapsu obj = new Incapsu();
	obj.setAjay("Aj");
	obj.setMob(98501971);
	obj.setDob(2542000);
	System.out.println(obj.getAjay());
	System.out.println(obj.getMob());
	System.out.println(obj.getDob());
}
}
