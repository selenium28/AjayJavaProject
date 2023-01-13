package Java;

public  class Encapsulation2 {
public String getProjectName() {
		return ProjectName;
	}
	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
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
	public double getParsents() {
		return parsents;
	}
	public void setParsents(double parsents) {
		this.parsents = parsents;
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
	public char getDefend() {
		return Defend;
	}
	public void setDefend(char defend) {
		Defend = defend;
	}
	public boolean isSuccessful() {
		return Successful;
	}
	public void setSuccessful(boolean successful) {
		Successful = successful;
	}
private String ProjectName;
private String UserName;
private int password;
private char Homepage;
private double parsents;
private int Dob;
private int TodayDate;
private char Defend;
private boolean Successful;

public static void main (String args[]) {
	Encapsulation2 obj = new Encapsulation2();
	obj.setProjectName("Tata");
	obj.setUserName("Selenium");
	obj.setPassword(983333003);
	obj.setHomepage('D');
	obj.setParsents(95.43);
	obj.setDob(24032000);
	obj.setTodayDate(26092022);
	obj.setDefend('F');
	obj.setSuccessful(true);;
	
	System.out.println("Projectname:- "+obj.getProjectName());
	System.out.println("Username:- "+obj.getUserName());
	System.out.println("Password:- "+obj.getPassword());
	System.out.println("Hamepage:- "+obj.getHomepage());
	System.out.println("Parsents:- "+obj.getParsents());
	System.out.println("Dob:- "+obj.getDob());
	System.out.println("Todaydate:- "+obj.getTodayDate());
	System.out.println("Defend:- "+obj.getDefend());
	System.out.println("Successful:- True ");
	
}
}
