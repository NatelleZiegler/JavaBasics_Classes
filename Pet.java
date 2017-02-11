public class Pet {
	//Fields
	private String name; //pet's name
	private String animal; //type of animal the pet is
	private int age; //the pet's age
	
	public void setName (String petName) {
		name = petName;
	}
	
	public void setAnimal (String type) {
		animal = type;
	}
	
	public void setAge (int petAge) {
		age = petAge;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAnimal () {
		return animal;
	}
	
	public int getAge () {
		return age;
	}
}