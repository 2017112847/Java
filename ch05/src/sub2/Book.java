package sub2;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private int availavleCopies;
	
	public Book(String title, String author, String isbn, int availavleCopies) {
		this.author = author;
		this.title = title;
		this.isbn = isbn;
		this.availavleCopies = availavleCopies;
	}
	
	public boolean borrowBook() {
		if(availavleCopies > 0) {
			availavleCopies--;
			return true;
		}
		else {
			return false;
		}
//		this.availavleCopies -= availableCopies;
		
	}
	public void returnbook() {
		availavleCopies++;
	}
	public void show() {
		System.out.println("도서명 : " + this.title);
		System.out.println("저자 : " + this.author);
		System.out.println("isbn : " + this.isbn);
		System.out.println("이용가능한복사본 : " + this.availavleCopies);
	}
	
	Book book1 = new Book("삼국지","ㅁㄴㅇㄹ","10001",10);
	book1.show();
	
	boolean isOk = book1.borrowBook();
	
	if(isOk) {
		System.out.println(book1.getTitle() + "성공");
	}else {
		System.out.println(book1.getTitle() + "실패");
	}
	
	book1.show();
	Book book2 = new Book("java","wewe","10002",1);
	boolean isOk1 = book2.borrowBook();
	boolean isOk2 = book2.borrowBook();
	
	if(isOk) {
		System.out.println(book2.getTitle() + "성공");
	}else {
		System.out.println(book2.getTitle() + "실패");
	}
	book2.show();
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public int getAvailavleCopies() {
		return availavleCopies;
	}
	public void setAvailavleCopies(int availavleCopies) {
		this.availavleCopies = availavleCopies;
	}
	
}
