class Book {
  // Enkapsulasi
  private String id;
  private String title;

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

  // Polimorfisme
  @Override
  public String toString() {
    return "Book [id=" + id + ", title=" + title + "]";
  }

  public void printInfo() {
    System.out.println("Book Info:");
    System.out.println("ID: " + id);
    System.out.println("Title: " + title);
  }

  public void printInfo(boolean includeId) {
    System.out.println("Book Info:");
    if (includeId) {
      System.out.println("ID: " + id);
    }
    System.out.println("Title: " + title);
  }
}
