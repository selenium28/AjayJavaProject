package Abcd;

public class Encapsulation {
	public static void main(String args[]) {
		Encapsulation obj=new Encapsulation();
		obj.setName("Ajay Gundkar");
		obj.setPassword(2772627);
		obj.setPresent(22.44);
		obj.setAccountNo(23300000);
		obj.setAmount(73648000);
		obj.setDob(18012022);
		obj.setHompage('A');
		
		System.out.println("Name"+obj.getName());
		System.out.println("Password"+obj.getPassword());
		System.out.println("present"+obj.getPresent());
		System.out.println("account"+obj.getAccountNo());
		System.out.println("amount"+obj.getAmount());
		System.out.println("Dob"+obj.getDob());
		System.out.println("Homepage"+obj.getHompage());
	}
 private String name;
 private int password;
 private char Hompage;
 private int Dob;
 private double present;
 private int accountNo;
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
public char getHompage() {
	return Hompage;
}
public void setHompage(char hompage) {
	Hompage = hompage;
}
public int getDob() {
	return Dob;
}
public void setDob(int dob) {
	Dob = dob;
}
public double getPresent() {
	return present;
}
public void setPresent(double present) {
	this.present = present;
}
public int getAccountNo() {
	return accountNo;
}
public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
private double amount;
}
