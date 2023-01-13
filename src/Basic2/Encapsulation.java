package Basic2;

public class Encapsulation {
	public static void main(String args[]) {
		Encapsulation obj = new Encapsulation();
		obj.setUserName("Selenium");
		obj.setPassword(12345677);
		obj.setHomepage('T');
		obj.setAccountNo(227788373);
		obj.setAmount(2000000);
		obj.setPresent(88.88);
		obj.setSuccessful(true);
		
		System.out.println("Username :-"+obj.getUserName());
		System.out.println("Password :-"+obj.getPassword());
		System.out.println("Homepage :-"+obj.getHomepage());
		System.out.println("accountNo :-"+obj.getAccountNo());
		System.out.println("Amount :-"+obj.getAmount());
		System.out.println("Present :-"+obj.getPresent());
		System.out.println("Successful :-true");
		
		
		
		
		
		
	}
public String UserName;
public int Password;
public char Homepage;
public int accountNo;
public int amount;
public double present;
public boolean Successful;
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
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
public double getPresent() {
	return present;
}
public void setPresent(double present) {
	this.present = present;
}
public boolean isSuccessful() {
	return Successful;
}
public void setSuccessful(boolean successful) {
	Successful = successful;
}

}
