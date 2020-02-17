package exercise2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);	
		Scanner sc3=new Scanner(System.in);
		Scanner sc4=new Scanner(System.in);
		Scanner sc5=new Scanner(System.in);
		Scanner sc6=new Scanner(System.in);
		Scanner sc7=new Scanner(System.in);
		ManagerDocument managerdoc=new ManagerDocument();
		Book book1=new Book(1,"kim dong", 1000, "nguyen", 90);
		Magazine magazine1=new Magazine(2,"tiền phong", 2000, 3, 10);
		Newspaper newspaper1=new Newspaper(3, "giáo dục", 300, 5);
		managerdoc.addDocument(newspaper1);
		managerdoc.addDocument(magazine1);
		managerdoc.addDocument(book1);
		while(true) {
			System.out.println("Application Manger Officer");
			System.out.println("Enter 1: To add officer");
			System.out.println("Enter 2: To delete officer by id");
			System.out.println("Enter 3: To show information of officer");
			System.out.println("Enter 4: To find document by category");
			System.out.println("Enter 5: To exit");
			int line1=sc1.nextInt();
			switch(line1) {
			case 1:{
				System.out.println("Enter 1: To add Book");
				System.out.println("Enter 2: To add Magazine");
				System.out.println("Enter 3: To add Newspaper");
				int line2=sc2.nextInt();
				switch(line2) {
				case 1:{
					System.out.println("Enter id:");
					int id=sc3.nextInt();
					System.out.println("Enter publishing house:");
					String publishingHouse=sc4.nextLine();
					System.out.println("Enter number document");
					int number=sc5.nextInt();
					System.out.println("Enter author");
					String author=sc6.nextLine();
					System.out.println("Enter number of page");
					int numberPage=sc7.nextInt();
					Book book=new Book(id, publishingHouse, number, author, numberPage);
					managerdoc.addDocument(book);
					System.out.println(book.toString());
					break;
				}
				case 2:{
					System.out.println("Enter id:");
					int id=sc3.nextInt();
					System.out.println("Enter publishing house:");
					String publishingHouse=sc4.nextLine();
					System.out.println("Enter number document");
					int number=sc5.nextInt();
					System.out.println("Enter issue number:");
					int issueNumber=sc6.nextInt();
					System.out.println("Enter month issue");
					int monthIssue=sc7.nextInt();
					Magazine magazine=new Magazine(id, publishingHouse, number, issueNumber, monthIssue);
					managerdoc.addDocument(magazine);
					System.out.println(magazine.toString());
					break;
				}
				case 3:{
					System.out.println("Enter id:");
					int id=sc3.nextInt();
					System.out.println("Enter publishing house:");
					String publishingHouse=sc4.nextLine();
					System.out.println("Enter number document");
					int number=sc5.nextInt();
					System.out.println("Enter day issue:");
					int dayIssue=sc6.nextInt();
					Newspaper newspaper=new Newspaper(id, publishingHouse, number, dayIssue);
					managerdoc.addDocument(newspaper);
					System.out.println(newspaper.toString());
					break;
				}
				}
				break;
			}
			case 2:{
				System.out.println("Enter officer id to delete");
				int id=sc2.nextInt();
				managerdoc.deleteDocument(id);
				break;
			}
			case 3:{
				System.out.println("Information of officers");
				managerdoc.showInfor();
				break;
			}
			case 4:{
				System.out.println("Enter 1: to find book");
				System.out.println("Enter 2: to find magazine");
				System.out.println("Enter 3: to find newspaper");
				int line2=sc2.nextInt();
				switch(line2) {
				case 1:{
					managerdoc.findBook();
					break;
				}
				case 2:{
					managerdoc.findMagazine();
					break;
				}
				case 3:{
					managerdoc.findNewspaper();
					break;
				}
				
				}
				break;
			}
			case 5:{
				return;
			}
			default:
				System.out.println("Invalid");
				continue;
			}
			
			
		}

	}

}
