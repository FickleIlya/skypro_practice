package Introduction.lessonObjects;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Ilya", "Shpagin");
        Author author2 = new Author("Ivan", "Grozniy");

        Book book1 = new Book("Great escape", author1, 2011);
        Book book2 = new Book("Great war", author2, 2021);

        Library library = new Library(2);
        String result = library.addBook(book1);
        System.out.println("result = " + result);
        library.addBook(book2);
        System.out.println("library.getBooks() = " + library.getBooks());
        System.out.println("library.getBookByTitle(\"Great escape\") = " + library.getBookByTitle("Great escape"));
        library.setBookYearByTitle("Great escape", 2000);
        System.out.println("library.getBookByTitle(\"Great escape\") = " + library.getBookByTitle("Great escape"));
        System.out.println("library.getBooks() = " + library.getBooks());
        System.out.println("library.getBookByTitle(\"Great\") = " + library.getBookByTitle("Great"));
    }


}
