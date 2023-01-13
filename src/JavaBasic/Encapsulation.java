package JavaBasic;

public  class Encapsulation {
	public static void main(String args[]) {
		Encapsulation obj =new Encapsulation();
		obj.setProjectName("Traspost System");
		obj.setPassword(34444444);
		obj.setHomePage('L');
		obj.setDob(27262968);
		obj.setTodayDate(19092022);
		System.out.println("Project\nName"+obj.getProjectName());
		System.out.println("Password"+obj.getPassword());
		System.out.println("Home page"+obj.getHomePage());
		System.out.println("dob"+obj.getDob());
		System.out.println("TodayDate"+obj.getTodayDate());
		
	}
	
	
	
	
private String ProjectName;
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
public char getHomePage() {
	return HomePage;
}
public void setHomePage(char homePage) {
	HomePage = homePage;
}
public boolean isSucessefull() {
	return Sucessefull;
}
public void setSucessefull(boolean sucessefull) {
	Sucessefull = sucessefull;
}
public int getDob() {
	return Dob;
}
public void setDob(int dob) {
	Dob = dob;
}
public int getTodayDate() {
	return todayDate;
}
public void setTodayDate(int todayDate) {
	this.todayDate = todayDate;
}
private int Password;
private char HomePage;
private boolean Sucessefull;
private int Dob;
private int todayDate;


}
