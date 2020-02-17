package exercise2;

import java.util.ArrayList;
import java.util.List;

public class ManagerDocument {
	List<Document> documents=new ArrayList<Document>();
	public ManagerDocument() {
		super();
	}
	public ManagerDocument(List<Document> documents) {
		super();
		this.documents = documents;
	}
	public void addDocument(Document doc) {
		documents.add(doc);
	}
	public boolean deleteDocument(int id) {
		Document doc=this.documents.stream()
				.filter(o->o.getId()==id)
				.findFirst().orElse(null);
		if(doc==null)
			return false;
		this.documents.remove(doc);
		return true;
		
		
	}
	public void showInfor() {
		this.documents.stream().forEach(o->System.out.println(o.toString()));
	}
	public void findBook() {
		this.documents.stream().filter(o -> o instanceof Book).forEach(o-> System.out.println(o.toString()));
	}
	public void findMagazine() {
		this.documents.stream().filter(o ->o instanceof Magazine).forEach(o-> System.out.println(o.toString()));
	}
	public void findNewspaper() {
		this.documents.stream().filter(o ->o instanceof Newspaper).forEach(o-> System.out.println(o.toString()));
	}
	
	

}
