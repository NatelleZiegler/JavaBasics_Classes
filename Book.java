public class Book {
	private String title;
	private String author;
	private String publisher;
	private int copiesSold;
	
	//constructor
	public Book(String name, String writer, String pub, int sales) {
		title = name;
		author = writer;
		publisher = pub;
		copiesSold = sales;
	}
	//mutator methods
	public void setTitle(String name) {
		title = name;
	}
	public void setAuthor(String writer) {
		author = writer;
	}
	public void setPublisher(String pub) {
		publisher = pub;
	}
	public void setCopiesSold(int sales) {
		copiesSold = sales;
	}
	
	//accessor methods
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getPublisher() {
		return publisher;
	}
	public int getCopiesSold() {
		return copiesSold;
	}
}