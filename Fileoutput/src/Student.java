
public class Student {

	private String name;
	private	double gpa; 
	private int grade;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	} 
	
	public String getInfo() {
		
		
		return "Hello my name is " + this.name + ". I am in grade " + this.grade + ". I have a " + this.gpa + " GPA for now at least";	
	}
	
	
}
