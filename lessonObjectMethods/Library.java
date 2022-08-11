package lessonObjectMethods;

public class Library {

    private final Book[] books;

    public Library(int booksArray){
        this.books = new Book[booksArray];
    }

    public String addBook(Book newBook){

        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == null) {
                this.books[i] = newBook;
                return newBook.toString();
            }
        }
        return "Library is full";
    }

    public String getBooks(){
        StringBuilder allBooks = new StringBuilder();
        for (Book book : this.books) {
            if (book != null) {
                allBooks.append(book).append(", ");
            }
        }
        return allBooks.substring(0, allBooks.lastIndexOf(","));
    }

    public String getBookByTitle(String title){
        String foundBook = "Book not found";
        for (Book book : this.books){
            if (book.getTitle().equals(title)) {
                if (!book.getTitle().equals(null) && !book.getAuthor().equals(null) && book.getYearPublished() != 0) {
                    foundBook = book.getTitle() + " by " + book.getAuthor().getName() + " " + book.getAuthor().getSurname()
                            + " was published in " + book.getYearPublished();
                }

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
