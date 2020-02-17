package exercise2;

public class Document {
	protected int id;
	protected String publishingHouse;
	protected int number;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPublishingHouse() {
		return publishingHouse;
	}
	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Document(int id, String publishingHouse, int number) {
		super();
		this.id = id;
		this.publishingHouse = publishingHouse;
		this.number = number;
	}
	public Document() {
		super();	
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id: "+this.id+"\nPublishing house: "+this.publishingHouse+"\nNumber document: "+this.number;
	}

}
