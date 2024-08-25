public class TestBook {
    public static void main(String[] args) {

        Author A1 = new Author("Kasun", "kasun@gmail.com", 'M');
        Author A2 = new Author("Kamali", "kamali@gmail.com", 'F');
        Author A3 = new Author("Upul", "upul@gmail.com", 'M');
        Author A4 = new Author("John", "john@gmail.com", 'M');

        Book B1 = new Book("Harry Potter",A1, 1341.2, 4);
        Book B2 = new Book("fdsgfdg", A2, 76786, 477);
        
        System.out.println(B1);
        System.out.println(B2);
    }
}
