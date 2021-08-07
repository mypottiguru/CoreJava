package Java8Features.MapAndFlatMap;

import java.util.List;

public class Customer {
	private int id;
	private String name;
	private String mailId;
	private List<String> phoneNumber;
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
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public List<String> getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", mailId=" + mailId + ", phoneNumber=" + phoneNumber + "]";
	}
	public Customer(int id, String name, String mailId, List<String> phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.mailId = mailId;
		this.phoneNumber = phoneNumber;
	}
	
	

}
