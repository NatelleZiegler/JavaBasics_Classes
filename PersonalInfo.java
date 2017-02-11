public class PersonalInfo {
	private String name; //holds a person's name
	private String address; //holds a person's address
	private int age; //holds a person's age
	private String phone; //holds a person's phone number
	
	//mutator methods
	
	public void setName(String userName) {
		name = userName;
	}
	
	public void setAddress(String userAddress) {
		address = userAddress;
	}
	
	public void setAge(int userAge) {
		age = userAge;
	}
	
	public void setPhone(String userPhone) {
		phone = userPhone;
	}
	
	//accessor methods
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getPhone() {
		return phone;
	}
	
}