package Java;

public class Encapsulation {
	public static void mmain(String args[]) {
		
	}
 private String name;
 private int password;
 private char Homepage;
 private int accountno;
 private int amount;
 private double persents;
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
public char getHomepage() {
	return Homepage;
}
public void setHomepage(char homepage) {
	Homepage = homepage;
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
public double getPersents() {
	return persents;
}
public void setPersents(double persents) {
	this.persents = persents;
}
public boolean isSuccessfull() {
	return successfull;
}
public void setSuccessfull(boolean successfull) {
	this.successfull = successfull;
}
private boolean successfull;
 
}
