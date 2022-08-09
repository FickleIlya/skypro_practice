package lessonObjects;

public class Library {

    private final Book[] books;

    public Library(int booksArray){
        this.books = new Book[booksArray];
    }

    public void addBook(Book newBook){

        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == null) {
                this.books[i] = newBook;
                break;
            }
        }
    }

    public String getBooks(){
        StringBuilder stringBooks = new StringBuilder();
        for (Book book : this.books) {
            if (book != null) {
                stringBooks.append(book.getAuthor().getName())
                        .append(" ").append(book.getAuthor().getSurname())
                        .append(": ").append(book.getTitle())
                        .append(": ").append(book.getYearPublished())
                        .append(", ");
            }
        }
        return stringBooks.substring(0, stringBooks.lastIndexOf(","));
    }

    public String getBookByTitle(String title){
        String foundBook = "Book not found";
        for (Book book : this.books){
            if (book.getTitle().equals(title)) {
                foundBook = book.getTitle() + " by " + book.getAuthor().getName() + " " + book.getAuthor().getSurname()
                + " was published in " + book.getYearPublished();
            }
        }
        return foundBook;
    }

    public void setBookYearByTitle(String title, int newYear){
        for (Book book : this.books) {
            if (book.getTitle().equals(title)) {
                book.setYearPublished(newYear);
            }
        }
    }
}
