import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBorrower {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before(){
        borrower = new Borrower("John");
        book = new Book("The Scriptures", "Phoebe WallerBridge", "Non-Fiction");
        library = new Library(5);
    }

    @Test
    public void bagStartsEmpty(){
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canAddBookToBag(){
        borrower.addBook(book);
        assertEquals(1, borrower.bookCount());
    }

}
