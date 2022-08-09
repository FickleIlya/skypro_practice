package lessonObjects;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("name1", "surname1");
        Author author2 = new Author("name2", "surname2");

        Book book1 = new Book("title1", author1, 2011);
        Book book2 = new Book("title2", author2, 2021);

        Library library = new Library(2);
        library.addBook(book1);
        library.addBook(book2);
        System.out.println("library.getBooks() = " + library.getBooks());
        System.out.println("library.getBookByTitle(\"title1\") = " + library.getBookByTitle("title1"));
        library.setBookYearByTitle("title1", 2000);
        System.out.println("library.getBookByTitle(\"title1\") = " + library.getBookByTitle("title1"));
        System.out.println("library.getBooks() = " + library.getBooks());
        System.out.println("library.getBookByTitle(\"title\") = " + library.getBookByTitle("title"));
    }


}
