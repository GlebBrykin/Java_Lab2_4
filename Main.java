import library.Book;
import library.LibraryItem;
import users.User;

public class Main
{
    public static void main(String[] args)
    {
        LibraryItem item = new Book();
        //item.title = "Война и мир"; // Ошибка!
        User user = new User("Иван");
        user.takeBook((Book)item);
        System.out.println(item.borrower);
    }
}