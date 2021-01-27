import java.util.ArrayList;

public class Borrower {


    private String name;
    private ArrayList<Book> bookBag;

    public Borrower(String name){
        this.name = name;
        this.bookBag = new ArrayList<>();
    }

    public int bookCount(){
        return bookBag.size();
    }

    public void addBook(Book book) {
        bookBag.add(book);
        bookBag.size();
    }
}
