package practice;

public class Incapsulation {
public String name;
public int Id;
public String click;
public char Homepage;
public boolean percent;
public int mob;
public int Dob;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getClick() {
	return click;
}
public void setClick(String click) {
	this.click = click;
}
public char getHomepage() {
	return Homepage;
}
public void setHomepage(char homepage) {
	Homepage = homepage;
}
public boolean isPercent() {
	return percent;
}
public void setPercent(boolean percent) {
	this.percent = percent;
}
public int getMob() {
	return mob;
}
public void setMob(int mob) {
	this.mob = mob;
}
public int getDob() {
	return Dob;
}
public void setDob(int dob) {
	Dob = dob;
}
public static void main(String args[]) {
	Incapsulation obj = new Incapsulation();
	obj.setName("Mr.Ajay-patil");
	obj.setId(27438832);
	obj.setClick("Loing");
	obj.setHomepage('A');
	obj.setMob(987663455);
	obj.setPercent(true);
	obj.setDob(25042000);
	
	System.out.println(obj.getName());
	System.out.println(obj.getId());
	System.out.println(obj.getClick());
	System.out.println(obj.getHomepage());
	System.out.println(obj.getMob());
	System.out.println(obj.getDob());
}
}
