import java.util.ArrayList;

class Library {
  public ArrayList<Book> books = new ArrayList<Book>();
  public ArrayList<Member> members = new ArrayList<Member>();

  public void addMember(Member member) {
    this.members.add(member);
  }
  
  public void addBook(Book book){
    this.books.add(book);
  }

  public int getMemberIndex(Member member) {
    return this.members.indexOf(member);
  }
  
  public Member getMemberById(String id) {
    for (Member member : this.members) {
      if (member.getId().equals(id)) {
        return member;
      }
    }
    return null;
  } 

  public Book getBookById(String id) {
    for (Book book : this.books) {
      if (book.getId().equals(id)) {
        return book;
      }
    }
    return null;
  }
  
  public Boolean isBookIdExist(String id) {
    Boolean isExist = false;
    try {
      for (Book book : this.books) {
        if (book.getId().equals(id)) {
          isExist = true;
        }
      }
    } 
    catch (NullPointerException e) {
      e.printStackTrace();
    }
    return isExist;
  }

  public Boolean isMemberIdExist(String id) {
    Boolean isExist = false;
    try {
      for (Member member : this.members) {
        if (member.getId().equals(id)) {
          isExist = true;
          break;
        }
      }
    } 
    catch (NullPointerException e) {
      e.printStackTrace();
    }
    return isExist;
  }

  public void giveBook(String bookId, String memberId) {
    Book book = this.getBookById(bookId);
    Member member = this.getMemberById(memberId);
    int memberIndex = this.getMemberIndex(member);
    this.books.remove(book);
    this.members.get(memberIndex).borrowedBooks.add(book);
  }

  public void receiveBook(String bookId, String memberId) {
    Member member = this.getMemberById(memberId);
    Book book = this.getBookById(bookId);
    int memberIndex = this.getMemberIndex(member);
    this.books.add(book);
    this.members.get(memberIndex).borrowedBooks.remove(book);
  }
}
