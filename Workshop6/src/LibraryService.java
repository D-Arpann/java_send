import java.util.*;

public class LibraryService {
    private List<String> books = new ArrayList<>();

    public void addBook(String bookTitle) {
        books.add(bookTitle);
    }

    public boolean searchBook(String bookTitle) {
        return books.contains(bookTitle);
    }
}


