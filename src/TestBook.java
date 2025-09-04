public class TestBook {
    public static void main(String[] args) {
        System.out.println("☰☰ Book Record System ☰☰\n");
        System.out.println("Adding books and ratings...");

        Book b1 = new Book("Java Programming", "John Smith");
        Book b2 = new Book("Data Structures", "Alice Brown");
        Book b3 = new Book("Web Development", "Bob Wilson");


        try {
            b1.addRating(4);
            System.out.println("Rating 4 added successfully");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        b1.addMultipleRatings(4, 4, 4, 4);
        System.out.println("Ratings added: 5, 4, 3, 5");


        try {
            b2.addRating(6);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        b2.addMultipleRatings(5, 4, 4, 4);


        b3.addMultipleRatings(3, 3, 4, 2, 4);


        System.out.println("\nBook Results:");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);


        System.out.println("\nTotal books created: " + Book.getTotalBooks());


        Book highest = b1;
        if (b2.getAverageRating() > highest.getAverageRating()) highest = b2;
        if (b3.getAverageRating() > highest.getAverageRating()) highest = b3;

        System.out.printf("Highest rated book: %s by %s (%.2f)",
                highest.getTitle(),
                highest.getAuthor(),
                highest.getAverageRating());
    }
}