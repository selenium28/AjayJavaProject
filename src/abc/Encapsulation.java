package abc;

public class Encapsulation {
	public static void main(String args[]) {
		Encapsulation obj = new Encapsulation();
		obj.setAppname("PMKVY");                            
		obj.setPassword(9800000);
		obj.setAccountNo(352938004);
		obj.setAmount(200000);
		obj.setUserId('M');
		obj.setPresent(98.99);
		obj.setProjectname("International");
		obj.setData(88888888);
		
		System.out.println("PMKVYName:- "+obj.getAppname());
		System.out.println("Password:- "+obj.getPassword());
		System.out.println("Acountno:- "+obj.getAccountNo());
		System.out.println("Amount:- "+obj.getAmount());
		System.out.println("UserId:- "+obj.getUserId());
		System.out.println("Present:- "+obj.getPresent());
		System.out.println("ProjectName:- "+obj.getProjectname());
		System.out.println("Data:- "+obj.getData());
		
	
	}
private String Appname;
public String getAppname() {
	return Appname;
}
public void setAppname(String appname) {
	Appname = appname;
}
public int getPassword() {
	return Password;
}
public void setPassword(int password) {
	Password = password;
}
public int getAccountNo() {
	return accountNo;
}
public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public char getUserId() {
	return userId;
}
public void setUserId(char userId) {
	this.userId = userId;
}
public double getPresent() {
	return present;
}
public void setPresent(double present) {
	this.present = present;
}
public String getProjectname() {
	return projectname;
}
public void setProjectname(String projectname) {
	this.projectname = projectname;
}
public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}
private int Password;
private int accountNo;
private int amount;
private char userId;
private double present;
private String projectname;
private int data;
}
