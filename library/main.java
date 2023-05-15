import java.util.Scanner;

class Main {

  static Scanner scan = new Scanner(System.in);
  static Library library = new Library();
  static Book book = new Book();

  public static void showMenu() {
    System.out.println("================================");
    System.out.println("1. show books list");
    System.out.println("2. show members list");
    System.out.println("3. add member");
    System.out.println("4. add book");
    System.out.println("5. return book");
    System.out.println("6. borrow book");
    System.out.println("================================");
  }

  public static void initLibraryData() {
    Book book1 = new Book();
    book1.setId("1");
    book1.setTitle("pemrograman java");

    Book book2 = new Book();
    book2.setId("2");
    book2.setTitle("pemrograman oop");

    Book book3 = new Book();
    book3.setId("3");
    book3.setTitle("pemrograman android");

    Member member1 = new Member();
    member1.setId("1") ;
    member1.setName("aka");

    Member member2 = new Member();
    member2.setId("2");
    member2.setName("budi");

    Member member3 = new Member();
    member3.setId("3");
    member3.setName("tono");

    library.books.add(book1);
    library.books.add(book2);
    library.books.add(book3);

    library.members.add(member1);
    library.members.add(member2);
    library.members.add(member3);
  }

  public static int chooseMenu() {
    System.out.print("choose menu : ");
    int pilihan = scan.nextInt();
    return pilihan;
  }

  public static void showBooks() {
    for (Book book : library.books) {
      System.out.println(book.getId() + " " + book.getTitle());
    }
  }

  public static void showMembers() {
    for (Member member : library.members) {
      System.out.println(member.getId() + " " + member.getName());
    }
  }

  public static void addMember() {
    Member member = new Member();

    System.out.print("id : ");
    String id = scan.next();
    member.setId(id);

    System.out.print("name : ");
    String name = scan.next();
    member.setName(name);

    if(library.isBookIdExist(id)==true){
      System.out.println("================================");
      System.out.println("Member Already Exist");
      System.out.println("================================");
    }
    else{
      library.addMember(member);
    }
  }

  public static void addbook(){
    Book book = new Book();

    System.out.print("id book :");
    String id = scan.next();
    book.setId(id);

    System.out.print("book tiltle :");
    String title = scan.next();
    book.setTitle(title);

    if(library.isBookIdExist(id)==true){
      System.out.println("================================");
      System.out.println("Book Already Exist");
      System.out.println("================================");
    }
    else{
      library.addBook(book);
    }
  }

  public static void borrowBook() {
    System.out.print("id member : ");
    String memberId = scan.next();

    System.out.print("id book : ");
    String bookId = scan.next();

    library.giveBook(bookId, memberId);
  }

  public static void returnBook() {
    System.out.print("id member : ");
    String memberId = scan.next();

    System.out.print("id book : ");
    String bookId = scan.next();

    library.receiveBook(memberId, bookId);
  }

  public static void Bookinfo() {
    book.printInfo();
  }

  public static void main(String[] args) {
    initLibraryData();

    String isContinue = "y";

    while (isContinue.equals("y")) {
      showMenu();
      int selectedMenu = chooseMenu();

      if (selectedMenu == 1) {
        showBooks();
      } 
      else if (selectedMenu == 2) {
        showMembers();
      } 
      else if (selectedMenu == 3) {
        addMember();
      } 
      else if (selectedMenu == 4) {
        addbook();
      } 
      else if (selectedMenu == 5) {
        returnBook();
      }
      else if (selectedMenu == 6) {
        borrowBook();
      } 
      else {
        System.out.println("wrong input");
      }

      System.out.print("continue ? ");
      isContinue = scan.next();
    }
  }
}