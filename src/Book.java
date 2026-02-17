public class Book {
    String title;
    String author;
    double price;

    void displayDetails() {
        System.out.println("Title: " + title+ " Author: " + author + " Price: " + price);

    }


}
class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Java basic";
        book.author = "Oracle";
        book.price = 25.5;
        book.displayDetails();

        Book book2 = new Book();
        book2.title = "Clean Code";
        book2.author = "Robert Martin";
        book2.price = 45.00;
        book2.displayDetails();

    }
}
