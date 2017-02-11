import java.util.*;
public class BookMaker {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the title of your book?");
		String bookTitle = scan.nextLine();
		System.out.println("Who is the author of your book?");
		String bookAuthor = scan.nextLine();
		System.out.println("What is the name of the book's publisher?");
		String publish = scan.nextLine();
		System.out.println("How many copies has the book sold?");
		int numSold = scan.nextInt();
		scan.nextLine();
		while (numSold < 0) {
			System.out.println("The number of copies sold must be a positive number.");
			System.out.println("How many copies has the books sold?");
			numSold = scan.nextInt();
			scan.nextLine();
		}
		
		Book text = new Book (bookTitle, bookAuthor, publish, numSold);
		
		System.out.println("Your book is titled " + text.getTitle() + ".");
		System.out.println("It was written by " + text.getAuthor() + ".");
		System.out.println("The book was published by " + text.getPublisher() + ".");
		System.out.println("It has sold " + text.getCopiesSold() + " copies.");
	}
}