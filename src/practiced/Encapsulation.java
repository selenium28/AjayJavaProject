package practiced;

public class Encapsulation {
public String Name;
public String Username;
public int password;
public char Homepage;
public int mob;
public int Dob;
public int Date;
public double present;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
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
public int getDate() {
	return Date;
}
public void setDate(int date) {
	Date = date;
}
public double getPresent() {
	return present;
}
public void setPresent(double present) {
	this.present = present;
}
public static void main(String args[]) {
	Encapsulation obj = new Encapsulation();
	obj.setName("Selenium");
	obj.setUsername("Mr.Ajaypatil");
	obj.setPassword(988888988);
	obj.setHomepage('G');
	obj.setMob(984039579);
	obj.setDob(25042000);
	obj.setDate(9042022);
	obj.setPresent(65.20);
	
	System.out.println(obj.getName());
	System.out.println(obj.getUsername());
	System.out.println(obj.password);
	System.out.println(obj.getHomepage());
	System.out.println(obj.getMob());
	System.out.println(obj.getDob());
	System.out.println(obj.getDate());
	System.out.println(obj.getPresent());
}
}
