class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Iron Flame", "Rebecca Yarros", 510);
        Book book2 = new Book("101 Essays That will Change the Way You Think", "Brianna West", 281);
        Book book3 = new Book("The Selection", "Kiera Cass", 328);

        System.out.println();

        book1.displayInfo();
        System.out.println();
        book2.displayInfo();
        System.out.println();
        book3.displayInfo();
        System.out.println();

        System.out.println();

        book3.borrowBook();
        book3.displayInfo();
        System.out.println();
        book2.returnBook();
        book2.displayInfo();
    }
}

class Book {
    String title;
    String author;
    int pages;
    boolean isAvailable;

    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isAvailable = true;
        System.out.println("A new book " + title + " by " + author + " has been added to the library!");
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Available: " + isAvailable);
    }

    void borrowBook() {
        isAvailable = false;
        System.out.println("" + title + " has been borrowed.");
    }

    void returnBook() {
        isAvailable = true;
        System.out.println("" + title + " has been returned.");
    }
}