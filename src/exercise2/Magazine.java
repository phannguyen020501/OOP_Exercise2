package exercise2;

public class Magazine extends Document {
	private int issueNumber;
	private int monthIssue;
	public int getIssueNumber() {
		return issueNumber;
	}
	public void setIssueNumber(int issueNumber) {
		this.issueNumber = issueNumber;
	}
	public int getMonthIssue() {
		return monthIssue;
	}
	public void setMonthIssue(int monthIssue) {
		this.monthIssue = monthIssue;
	}
	public Magazine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Magazine(int id, String publishingHouse, int number) {
		super(id, publishingHouse, number);
		// TODO Auto-generated constructor stub
	}
	public Magazine(int id, String publishingHouse, int number) {
		super(id, publishingHouse, number);
	}
	public Magazine(int id, String publishingHouse, int number, int issueNumber, int monthIssue) {
		super(id, publishingHouse, number);
		this.issueNumber = issueNumber;
		this.monthIssue = monthIssue;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nIssue number: "+this.issueNumber+"\nMonth issue: "+this.monthIssue;
	}
	

}
