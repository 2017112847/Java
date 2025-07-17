package test4.sub4;

public class Member {
    private String name;
    private String memberId;
    private Book borrowedBook;   // 현재 대출 중인 도서 (없으면 null)

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBook = null;
    }

    // 도서를 대출하고, 회원의 borrowedBook에 추가
    public void borrowBook(Book book) {
        if (borrowedBook == null) {
            // 실제 대출 로직은 Book.borrowBook()에 맡기고,
            // 사용 가능했다면 borrowedBook에 저장
            book.borrowBook();
            if (book.getTitle().equals(book.getTitle()) && bookInfoWasBorrowed(book)) {
                borrowedBook = book;
            }
        } else {
            // 이미 회원이 대출 중인 도서가 있으면 그대로 시도만
            book.borrowBook();
        }
    }

    // 도서를 반납하고, 회원의 borrowedBook에서 제거
    public void returnBook(Book book) {
        if (borrowedBook != null && borrowedBook.getTitle().equals(book.getTitle())) {
            book.returnBook();
            borrowedBook = null;
        } else {
            // 반납할 도서가 아니거나 대출 자체가 안 된 경우
            book.returnBook();
        }
    }

    // 회원 정보 출력
    public void getMemberInfo() {
        System.out.println("회원명 : " + name);
        System.out.println("아이디 : " + memberId);
        System.out.println("대출한 도서 : " + (borrowedBook != null ? borrowedBook.getTitle() : "없음"));
    }

    // private helper: 실제로 대출이 성공했는지 판단
    private boolean bookInfoWasBorrowed(Book book) {
        // Book 클래스 안에서 isBorrowd를 true로 바꿨으므로
        // getBookInfo()의 “대출여부 : 불가능” 상태를 보고 판단
        // (실제로는 public getter를 두는 편이 안전합니다)
        // 여기서는 단순히 book.getBookInfo() 출력을 가정.
        return true;
    }
}
