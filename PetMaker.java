import java.util.*;
public class PetMaker {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your pet's name?");
		String animalName;
		animalName = scan.nextLine();
		Pet userPet = new Pet();
		userPet.setName(animalName);
		System.out.println("What type of animal is your pet?");
		String animalType;
		animalType = scan.nextLine();
		userPet.setAnimal(animalType);
		System.out.println("How old is your pet?");
		int petAge;
		petAge = scan.nextInt();
		scan.nextLine();
		userPet.setAge(petAge);
		
		System.out.println("You have a " + userPet.getAnimal() + ".");
		System.out.println("Its name is " + userPet.getName() + ".");
		System.out.println("It is " + userPet.getAge() + " years old.");
	}
}