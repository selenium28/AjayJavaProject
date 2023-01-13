package Incapsulation;

public class Laptop {
public String Name;
public char userid;
public int password;
public String Homename;
public int DOB;
public int Mob;
public double OTP;
public boolean Successful;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public char getUserid() {
	return userid;
}
public void setUserid(char userid) {
	this.userid = userid;
}
public int getPassword() {
	return password;
}
public void setPassword(int password) {
	this.password = password;
}
public String getHomename() {
	return Homename;
}
public void setHomename(String homename) {
	Homename = homename;
}
public int getDOB() {
	return DOB;
}
public void setDOB(int dOB) {
	DOB = dOB;
}
public int getMob() {
	return Mob;
}
public void setMob(int mob) {
	Mob = mob;
}
public double getOTP() {
	return OTP;
}
public void setOTP(double oTP) {
	OTP = oTP;
}
public boolean isSuccessful() {
	return Successful;
}
public void setSuccessful(boolean successful) {
	Successful = successful;
}
public static void main(String args[]) {
	Laptop obj = new Laptop();
	obj.setName("Ajay");
	obj.setUserid('A');
	obj.setPassword(238469369);
	obj.setHomename("Display");
	obj.setDOB(25042000);
	obj.setMob(947536747);
	obj.setOTP(04444);
	obj.setSuccessful(true);
	
	System.out.println(obj.getName());
	System.out.println(obj.getUserid());
	System.out.println(obj.getPassword());
	System.out.println(obj.getHomename());
	System.out.println(obj.getDOB());
	System.out.println(obj.getMob());
	System.out.println(obj.getOTP());
	System.out.println("True");
}
}
