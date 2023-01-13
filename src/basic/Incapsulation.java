package basic;

public class Incapsulation {
public String Name;
public char UserId;
public int Password;
public double Present;
public int Dob;
public int Mob;
public int Date;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public char getUserId() {
	return UserId;
}
public void setUserId(char userId) {
	UserId = userId;
}
public int getPassword() {
	return Password;
}
public void setPassword(int password) {
	Password = password;
}
public double getPresent() {
	return Present;
}
public void setPresent(double present) {
	Present = present;
}
public int getDob() {
	return Dob;
}
public void setDob(int dob) {
	Dob = dob;
}
public int getMob() {
	return Mob;
}
public void setMob(int mob) {
	Mob = mob;
}
public int getDate() {
	return Date;
}
public void setDate(int date) {
	Date = date;
}
public static void main (String args[]) {
	Incapsulation obj = new Incapsulation();
	obj.setName("Ajay-Gundekar");
	obj.setUserId('G');
	obj.setPassword(8327764);
	obj.setPresent(24.55);
	obj.setDob(25042000);
	obj.setMob(98526473);
	obj.setDate(24032022);
	
	System.out.println(obj.getName());
	System.out.println(obj.getUserId());
	System.out.println(obj.getPassword());
	System.out.println(obj.getPresent());
	System.out.println(obj.getDob());
	System.out.println(obj.getMob());
	System.out.println(obj.getDate());
}
}
