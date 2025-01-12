package users;

import library.Book;

public class User
{
    public String name;

    public User(String name)
    {
        this.name = name;
    }

    public void takeBook(Book book)
    {
        book.checkOut(this.name);
    }
}
