package library;

public class Book extends LibraryItem
{
    public void checkOut(String borrower)
    {
        this.borrower = borrower;
    }
}
