package ObjectClass.DeepCopy;

public class Company implements Cloneable {
	private int id;
	private String name;
	private CompanyAddress address;

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

	public CompanyAddress getAddress() {
		return address;
	}

	public void setAddress(CompanyAddress address) {
		this.address = address;
	}

	public Company(int id, String name, CompanyAddress address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Company company = (Company) super.clone();
		company.setAddress((CompanyAddress) address.clone());
		return company;

	}

}
