package JavaProject;

public class Encapsulation {
private String name;
private int password;
private int accountno;
private int amount;
private char userId;
private double precent;
private String getName() {
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
public int getAccountno() {
	return accountno;
}
public void setAccountno(int accountno) {
	this.accountno = accountno;
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
public double getPrecent() {
	return precent;
}
public void setPrecent(double precent) {
	this.precent = precent;
}
public static void main (String args[]) {
	Encapsulation obj= new Encapsulation();
	obj.setName("Java projcte");
	obj.setPassword(999888877);
	obj.setAccountno(236003299);
	obj.setAmount(1000000);
	obj.setUserId('S');
	obj.setPrecent(87.55);
	System.out.println("              This is setter and getter method");
	System.out.println(" This is encapsulation");
	System.out.println(obj.getName());
	System.out.println(obj.getPassword());
	System.out.println(obj.getAccountno());
	System.out.println(obj.getAmount());
	System.out.println(obj.getUserId());
	System.out.println(obj.getPrecent());
		
}
}
