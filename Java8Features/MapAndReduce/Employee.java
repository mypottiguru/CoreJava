package Java8Features.MapAndReduce;

public class Employee {
	private int id;
	private String String;
	private double sal;
	private String grade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getString() {
		return String;
	}

	public void setString(String string) {
		String = string;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", String=" + String + ", sal=" + sal + ", grade=" + grade + "]";
	}

	public Employee(int id, java.lang.String string, double sal, java.lang.String grade) {
		super();
		this.id = id;
		String = string;
		this.sal = sal;
		this.grade = grade;
	}

}
