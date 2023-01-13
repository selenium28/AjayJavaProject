package Basic2;

public class Encapsulation2 {
	public static void main (String args[]) {
		Encapsulation2 obj = new Encapsulation2();
		obj.setName("Mr-Ajay");
		obj.setPassword(98288882);
		obj.setHomepage('D');
		obj.setAccountNo(474637683);
		obj.setAmount(500000000);
		obj.setPersent(47.55);
		obj.setDob(25042000);
		obj.setTodayDate(18092022);
		obj.setSuccessful(true);
		
		System.out.println("Name "+obj.getName());
		System.out.println("Password "+obj.getPassword());
		System.out.println("Homae "+obj.getHomepage());
		System.out.println("AccountNo "+obj.getAccountNo());
		System.out.println("Amount "+obj.getAmount());
		System.out.println("Persent "+obj.getPersent());
		System.out.println("Dob "+obj.getDob());
		System.out.println("TodayDate "+obj.getTodayDate());
		
		
	}
private String Name;
private int Password;
private char Homepage;
private int AccountNo;
private int amount;
private double persent;
private int dob;
private int TodayDate;
private boolean successful;
private String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getPassword() {
	return Password;
}
public void setPassword(int password) {
	Password = password;
}
public char getHomepage() {
	return Homepage;
}
public void setHomepage(char homepage) {
	Homepage = homepage;
}
public int getAccountNo() {
	return AccountNo;
}
public void setAccountNo(int accountNo) {
	AccountNo = accountNo;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public double getPersent() {
	return persent;
}
public void setPersent(double persent) {
	this.persent = persent;
}
public int getDob() {
	return dob;
}
public void setDob(int dob) {
	this.dob = dob;
}
public int getTodayDate() {
	return TodayDate;
}
public void setTodayDate(int todayDate) {
	TodayDate = todayDate;
}
public boolean isSuccessful() {
	return successful;
}
public void setSuccessful(boolean successful) {
	this.successful = successful;
}
}
