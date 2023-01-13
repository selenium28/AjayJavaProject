package abc;

public class Encapsulation2 {
	private String projectname;
	private int password;
	private char homepage;
	private int amount;
	private int DOF;
	private double presents;

	public static void main(String args[]) {
		Encapsulation2 obj = new Encapsulation2();
		obj.setProjectname("Ajay Gunsekar");
		obj.setPassword(27337928);
		obj.setHomepage('A');
		obj.setAmount(300000000);
		obj.setDOF(25042000);
		obj.setPresents(22.33);

		System.out.println("projectname:- "+obj.getProjectname());
		System.out.println("password:- "+obj.getPassword());
		System.out.println("Homepage:- "+obj.getHomepage());
		System.out.println("Amount:- "+obj.getAmount());
		System.out.println("DOF:- "+obj.getDOF());
		System.out.println("Presents:- "+obj.getPresents());

	}

	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
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
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getDOF() {
		return DOF;
	}
	public void setDOF(int dOF) {
		DOF = dOF;
	}
	public double getPresents() {
		return presents;
	}
	public void setPresents(double presents) {
		this.presents = presents;
	}

}
