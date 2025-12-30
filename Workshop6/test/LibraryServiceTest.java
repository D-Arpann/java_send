import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceTest {

    private LibraryService library;

    @BeforeAll
    static void initAll() {
        System.out.println("Starting Library Service Tests");
    }

    @BeforeEach
    void setUp() {
        library = new LibraryService();
        library.addBook("Existing Book");
    }

    @Test
    void testAddBook() {
        library.addBook("New Book");
        assertTrue(library.searchBook("New Book"));
    }

    @Test
    void testSearchBook() {
        assertTrue(library.searchBook("Existing Book"));
        assertFalse(library.searchBook("Nonexistent Book"));
    }

    @AfterEach
    void tearDown() {
        library = null;
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Finished Library Service Tests");
    }
}




