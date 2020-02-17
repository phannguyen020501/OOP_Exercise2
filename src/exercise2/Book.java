package exercise2;

public class Book extends Document {
	private String author;
	private int numberPage;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getNumberPage() {
		return numberPage;
	}
	public void setNumberPage(int numberPage) {
		this.numberPage = numberPage;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String publishingHouse, int number) {
		super(id, publishingHouse, number);
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String publishingHouse, int number) {
		super(id, publishingHouse, number);
	}
	public Book(int id, String publishingHouse, int number, String author, int numberPage) {
		super(id, publishingHouse, number);
		this.author = author;
		this.numberPage = numberPage;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nAuthor: "+this.author+"\nNumber page: "+this.numberPage;
	}
	

}
