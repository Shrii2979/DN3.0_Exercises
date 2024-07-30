package example.library;

public class LibraryTest {

	public static void main(String[] args) {
		LibraryManagement library = new LibraryManagement(10);

        
        library.addBook(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book(2, "1984", "George Orwell"));
        library.addBook(new Book(3, "To Kill a Mockingbird", "Harper Lee"));

        
        System.out.println("Linear Search for '1984':");
        Book book = library.linearSearchByTitle("1984");
        System.out.println(book != null ? book : "Book not found");

       
        library.sortBooksByTitle();

        
        System.out.println("Binary Search for '1984':");
        book = library.binarySearchByTitle("1984");
        System.out.println(book != null ? book : "Book not found");
    }
	}

