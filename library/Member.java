import java.util.ArrayList;

abstract class Member {
  private String id;
  private String name;
  public ArrayList<Book> borrowedBooks = new ArrayList<Book>();
  
  abstract void addMember(String id, String name);

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<Book> getBorrowedBooks() {
    return borrowedBooks;
  }

  public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
    this.borrowedBooks = borrowedBooks;
  }

  public void receiveBook(Book book) {
    this.borrowedBooks.add(book);
  }

  public void giveBook(Book book) {
    this.borrowedBooks.remove(book);
  }
}
class MemberAdd extends Member{
  @Override
  void addMember(String id, String name){
    this.setId(id);
    this.setName(name);
  }
} 
