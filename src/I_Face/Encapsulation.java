package I_Face;

public class Encapsulation {
	public static void main(String[]args) {
		Encapsulation obj= new Encapsulation();
		obj.setProjectName("Dasing");
		obj.setPassword(72726);
		obj.setAccountNo(877337387);
		obj.setAmout(22.0000000);
		obj.setCheking('S');
		obj.setSuccessful(true);
		
		System.out.println("ProjectName "+obj.getProjectName());
		System.out.println("Password "+obj.getPassword());
		System.out.println("AccountNo "+obj.getAccountNo());
		System.out.println("Amount "+obj.getAmout());
		System.out.println("Cheking "+obj.getCheking());
	}
private String ProjectName;
private int Password;
private int accountNo;
private char Cheking;
private double amout;
private boolean successful;
public String getProjectName() {
	return ProjectName;
}
public void setProjectName(String projectName) {
	ProjectName = projectName;
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
public char getCheking() {
	return Cheking;
}
public void setCheking(char cheking) {
	Cheking = cheking;
}
public double getAmout() {
	return amout;
}
public void setAmout(double amout) {
	this.amout = amout;
}
public boolean isSuccessful() {
	return successful;
}
public void setSuccessful(boolean successful) {
	this.successful = successful;
}

}
