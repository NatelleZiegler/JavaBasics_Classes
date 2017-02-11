public class PersonalInfoTest {
	public static void main(String [] args) {
		PersonalInfo me = new PersonalInfo();
		String myName = "Natelle Ziegler";
		me.setName(myName);
		String myAddress = "628 Hamilton Road";
		me.setAddress(myAddress);
		int myAge = 26;
		me.setAge(myAge);
		String myPhone = "412-780-3828";
		me.setPhone(myPhone);
		
		PersonalInfo bear = new PersonalInfo();
		String bearName = "Paddington Bear";
		bear.setName(bearName);
		String bearAddress = "32 Windsor Gardens";
		bear.setAddress(bearAddress);
		int bearAge = 57;
		bear.setAge(bearAge);
		String bearPhone = "020-929-1919";
		bear.setPhone(bearPhone);
		
		PersonalInfo doctor = new PersonalInfo();
		String doctorName = "John Dolittle";
		doctor.setName(doctorName);
		String doctorAddress = "Oxenthorpe Rd";
		doctor.setAddress(doctorAddress);
		int doctorAge = 95;
		doctor.setAge(doctorAge);
		String doctorPhone = "123-123-1234";
		doctor.setPhone(doctorPhone);
		
		System.out.println();
		System.out.println("Name\t\t\tAddress\t\t\t\tAge");
		System.out.println("__________________________________________________________________");
		System.out.println(me.getName() + "\t\t" + me.getAddress() + "\t\t" + me.getAge());
		System.out.println(bear.getName() + "\t\t" + bear.getAddress() + "\t\t" + bear.getAge());
		System.out.println(doctor.getName() + "\t\t" + doctor.getAddress() + "\t\t\t" + doctor.getAge());
		System.out.println();
	}
}