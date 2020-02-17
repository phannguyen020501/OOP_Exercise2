package exercise2;

public class Newspaper extends Document {
	private int dayIssue;

	public int getDayIssue() {
		return dayIssue;
	}

	public void setDayIssue(int dayIssue) {
		this.dayIssue = dayIssue;
	}

	public Newspaper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Newspaper(int id, String publishingHouse, int number) {
		super(id, publishingHouse, number);
		// TODO Auto-generated constructor stub
	}
	
	public Newspaper(int id, String publishingHouse, int number) {
		super(id, publishingHouse, number);
	}

	public Newspaper(int id, String publishingHouse, int number, int dayIssue) {
		super(id, publishingHouse, number);
		this.dayIssue = dayIssue;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nDay issue: "+this.dayIssue;
	}
	
}
