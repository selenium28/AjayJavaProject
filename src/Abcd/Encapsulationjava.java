package Abcd;

public class Encapsulationjava {
private String name;
private int password;
private char Homepage;
private int amount;
private int acountNo;
private double HowmanyAmount;
private boolean suceesseful;

public static void main(String args[]) {
	Encapsulationjava obj=new Encapsulationjava();
	obj.setName("Mr.Ajay-Patil");
	obj.setPassword(98227622);
	obj.setHomepage('Z');
	obj.setAmount(250000000);
	obj.setAcountNo(348253827);
	obj.setHowmanyAmount(91.000000000);
	obj.setSuceesseful(true);
	
	System.out.println("Name-"+obj.getName());
	System.out.println("Password-"+obj.getPassword());
	System.out.println("Homepage-"+obj.getHomepage());
	System.out.println("Amount-"+obj.getAmount());
	System.out.println("Acount-"+obj.getAcountNo());
	System.out.println("HowmanyAmount-"+obj.getHowmanyAmount());
}
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
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public int getAcountNo() {
	return acountNo;
}
public void setAcountNo(int acountNo) {
	this.acountNo = acountNo;
}
public double getHowmanyAmount() {
	return HowmanyAmount;
}
public void setHowmanyAmount(double howmanyAmount) {
	HowmanyAmount = howmanyAmount;
}
public boolean isSuceesseful() {
	return suceesseful;
}
public void setSuceesseful(boolean suceesseful) {
	this.suceesseful = suceesseful;
}


}
