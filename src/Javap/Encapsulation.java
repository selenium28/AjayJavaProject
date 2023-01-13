package Javap;

public class Encapsulation {
	private String username;
	private int password;
	private char homepage;
	private int acountNo;
	private double amount;
	private int Dob;
	private int TodayDate;
	private boolean successeful;

	static public void main(String []args) {
		Encapsulation obj =new Encapsulation();
		obj.setUsername("Ajay");
		obj.setPassword(234356);
		obj.setHomepage('F');
		obj.setAcountNo(986383863);
		obj.setAmount(2332.000);
		obj.setDob(25032000);
		obj.setTodayDate(10112022);


		System.out.println("username:- "+obj.getUsername());
		System.out.println("Password:- "+obj.getPassword());
		System.out.println("Homepage:- "+obj.getHomepage());
		System.out.println("AcountNo:- "+obj.getAcountNo());
		System.out.println("Amount:- "+obj.getAmount());
		System.out.println("DOB:- "+obj.getDob());
		System.out.println("TodayDate:- "+obj.getTodayDate());
		System.out.println("Suceeseeful:- True");
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public char getHomepage() {
		return homepage;
	}
	public void setHomepage(char homepage) {
		this.homepage = homepage;
	}
	public int getAcountNo() {
		return acountNo;
	}
	public void setAcountNo(int acountNo) {
		this.acountNo = acountNo;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getDob() {
		return Dob;
	}
	public void setDob(int dob) {
		Dob = dob;
	}
	public int getTodayDate() {
		return TodayDate;
	}
	public void setTodayDate(int todayDate) {
		TodayDate = todayDate;
	}

}
