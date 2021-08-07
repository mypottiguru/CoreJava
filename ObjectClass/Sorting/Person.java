package ObjectClass.Sorting;

public class Person implements Comparable<Person> {
	private int id;
	private String name;
	private double sal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

	public Person(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public int compareTo(Person o) {
		if (this.id > o.id) {
			return 1;
		} else {
			if (this.id < o.id) {
				return -1;
			}
		}
		return 0;
	}

}
