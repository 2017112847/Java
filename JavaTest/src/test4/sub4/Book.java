package test4.sub4;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private boolean isBorrowd;

	public Book(String title, String author, String isbn, boolean isBorrowd) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isBorrowd = false;
	}
	public void borrowBook() {
		if(!isBorrowd) {
			isBorrowd = true;
			System.out.println("대출여부 : 가능");
		}else {
			System.out.println("대출여부 : 불가능");
		}
	}
	public void returnBook() {
		System.out.println("도서반납 : " + title);
	}
	public void getBookInfo() {
		System.out.println("도서명 : "+title);
		System.out.println("저자 :"+ author);
		System.out.println("ISBN :"+ isbn);
		System.out.println("대출 여부 :"+ isBorrowd);
	}
	public String getTitle() {
		return title;
	}
	
//	public String getTitle() {}

}
