public class Employee {
	private String name; //holds employee's name
	private int idNumber; //holds employee's ID number
	private String department; //holds name of department employee works in
	private String position; //holds employee's job title
	
	public Employee(String employeeName, int id, String dept, String title) {
		name = employeeName;
		idNumber = id;
		department = dept;
		position = title;
	}
	
	public Employee(String employeeName, int id) {
		name = employeeName;
		idNumber = id;
		department = "";
		position = "";
	}
	
	public Employee() {
		name = "";
		idNumber = 0;
		department = "";
		position = "";
	}
	
	//mutator methods
	
	public void setName(String employeeName) {
		name = employeeName;
	}
	
	public void setIdNumber(int id) {
		idNumber = id;
	}
	
	public void setDepartment(String dept) {
		department = dept;
	}
	
	public void setPosition(String title) {
		position = title;
	}
	
	//accessor methods
	
	public String getName() {
		return name;
	}
	
	public int getIdNumber() {
		return idNumber;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String getPosition() {
		return position;
	}
}