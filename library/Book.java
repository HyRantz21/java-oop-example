abstract class Book {
  private String id;
  private String title;

  abstract void addBook(String id, String title);

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
class BookAdd extends Book{
  @Override
  void addBook(String id, String title){
    this.setId(id);
    this.setTitle(title);
  }
}
