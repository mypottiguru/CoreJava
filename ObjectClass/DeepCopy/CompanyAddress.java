package ObjectClass.DeepCopy;

public class CompanyAddress implements Cloneable{
	private String city;
	private int pincode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public CompanyAddress(String city, int pincode) {
		super();
		this.city = city;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "CompanyAddress [city=" + city + ", pincode=" + pincode + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
