import java.util.*;

public class Library {
    private static Book[] inventory;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        inventory = new Book[20];

        inventory[0] = new Book(1, "00001", "1984", false, "");
        inventory[1] = new Book(2, "00010", "Atlas Shrugged", false, "");
        inventory[2] = new Book(3, "00011", "Atomic Habits", false, "");
        inventory[3] = new Book(4, "00100", "Bank to the Future", false, "");
        inventory[4] = new Book(5, "00101", "Broken Money", false, "");
        inventory[5] = new Book(6, "00110", "Capitalism and Freedom", false, "");
        inventory[6] = new Book(7, "00111", "Covert Regime Change", false, "");
        inventory[7] = new Book(8, "01000", "Free to Choose: A Personal Statement", false, "");
        inventory[8] = new Book(9, "01001", "Meditations", false, "");
        inventory[9] = new Book(10, "01010", "One Nation Under Blackmail Vol1", false, "");
        inventory[10] = new Book(11, "01011", "One Nation Under Blackmail Vol2", false, "");
        inventory[11] = new Book(12, "01100", "Operation Gladio", false, "");
        inventory[12] = new Book(13, "01101", "Principles of Economics", false, "");
        inventory[13] = new Book(14, "01110", "The Age of AI", false, "");
        inventory[14] = new Book(15, "01111", "The Bitcoin Standard", false, "");
        inventory[15] = new Book(16, "10000", "The Creature from Jekyll Island", false, "");
        inventory[16] = new Book(17, "10001", "The Object Stares Back", false, "");
        inventory[17] = new Book(18, "10010", "The Price of Tomorrow", false, "");
        inventory[18] = new Book(19, "10011", "The Sovereign Individual", false, "");
        inventory[19] = new Book(20, "10100", "Tower of Basel", true, "Diana Smith");

        while (true) {
            System.out.println("""
                    Please choose from following options:
                    1. Show Available Books
                    2. Show Checked Out Books
                    3. Exit - closes out of the application
                    """);
            System.out.println("Enter your choice now: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    showAvailable();

                        System.out.println("""
                                \nEnter the Id of a book you would like to check out.
                                To go back to the main menu, enter 0.""");
                        int userInputCo = Integer.parseInt(scanner.nextLine());

                        Book selectedBook = null;
                        for (Book book : inventory) {
                            if (book.getId() == userInputCo) {
                                selectedBook = book;
                                System.out.println("Enter your name: ");
                                String name = scanner.nextLine();
                                selectedBook.checkOutName(name);
//                                if(name.isBlank()) {
//                                    System.out.println("Name cannot be blank. Please enter your name.");
//                                    continue;
//                                }
//                                selectedBook.setCheckedOutTo(name);
//                                selectedBook.setCheckedOut(true);
                                System.out.printf("Checked out: %s to %s%n%n", selectedBook.getTitle(), selectedBook.getCheckedOutTo());
                                break;
                            } else if (userInputCo > inventory.length) {
                                System.out.println("Book with that Id doesn't exist.");
                                break;
                            }
                        }
                        if (userInputCo == 0) {
                            break;
                        }
                    break;

                case 2:
                    showCheckedOut();
                        System.out.println("""
                                Enter the Id of a book you would like to check in.
                                To go back to the main menu, enter 0.""");

                        int userInputCi = Integer.parseInt(scanner.nextLine());

                        for (Book book : inventory) {
                            if (book.getId() == userInputCi) {
                                selectedBook = book;
                                selectedBook.checkIn();
                                System.out.printf("%s has been successfully checked in.%n%n", selectedBook.getTitle());
                            }
                        }
                        break;

                case 3:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please choose from option 1-3");
                    break;
            }

        }

    }

    //region library methods
    public static void showAvailable() {
        System.out.println("Currently available books:");
        for (Book book : inventory) {
            if (!book.checkedOut()) {
                System.out.printf("""
                        Id: %d, ISBN: %s, Title: %s
                        \n""", book.getId(), book.getIsbn(), book.getTitle());
            }
        }

    }

    public static void showCheckedOut() {
        System.out.println("Books currently checked out:");
        for (Book book : inventory) {
            if (book.checkedOut()) {
                System.out.printf("""
                        Id: %d, ISBN: %s, Title: %s
                        \n""", book.getId(), book.getIsbn(), book.getTitle());
            }
        }

    }
    //endregion
}






