public class EmployeeData {
	public static void main(String[] args) {
		String nameA = "Susan Meyers";
		String nameB = "Mark Jones";
		String nameC = "Joy Rogers";
		
		int numA = 47899;
		int numB = 39119;
		int numC = 81774;
		
		String deptA = "Accounting";
		String deptB = "IT";
		String deptC = "Manufacturing";
		
		String titleA = "Vice President";
		String titleB = "Programmer";
		String titleC = "Engineer";
		
		Employee employA = new Employee(nameA, numA, deptA, titleA);
		Employee employB = new Employee(nameB, numB, deptB, titleB);
		Employee employC = new Employee(nameC, numC, deptC, titleC);
		
		System.out.println();
		System.out.println("Name\t\tID\t\tDepartment\t\tPosition");
		System.out.println("_______________________________________________________________________");
		System.out.println();
		System.out.println(employA.getName() + "\t" + employA.getIdNumber() + 
		"\t\t" + employA.getDepartment() + "\t\t" + employA.getPosition());
		System.out.println(employB.getName() + "\t" + employB.getIdNumber() + 
		"\t\t" + employB.getDepartment() + "\t\t\t" + employB.getPosition());
		System.out.println(employC.getName() + "\t" + employC.getIdNumber() + 
		"\t\t" + employC.getDepartment() + "\t\t" + employC.getPosition());
		System.out.println();
	}
}