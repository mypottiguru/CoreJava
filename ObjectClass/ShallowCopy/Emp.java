package ObjectClass.ShallowCopy;

public class Emp implements Cloneable{
	private int id;
	private String name;
	private Add address;
	public Emp(int id, String name, Add address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
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
	public Add getAddress() {
		return address;
	}
	public void setAddress(Add address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	

}
