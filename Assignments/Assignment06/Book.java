package Assignment06;


import java.util.ArrayList;

public class Book {
    int bookId;
    String bookName, authorName;

    Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public int getBookId() {
        return bookId;
    }

    String getBookName() {
        return bookName;
    }

    String getAuthorName() {
        return authorName;

    }

    public String toString() {
        return "BookId: " + bookId + " BookName: " + bookName + " AuthorName: " + authorName;
    }

}


class BookData  extends Book {
    BookData(int bookId, String bookName, String authorName) {
        super(bookId, bookName, authorName);
    }

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(101, "let us c", "Yashvant p kanetkar"));
        books.add(new Book(102, "head first java", "kathy sierra"));
        books.add(new Book(103, "java", "barry"));
        System.out.println("Book Details:  ");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
