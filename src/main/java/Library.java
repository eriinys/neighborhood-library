import java.util.*;

public class Library {
    private static final Book[] inventory = new Book[20];

    public static void main(String[] args) {
        mainInventory();

        Scanner scanner = new Scanner(System.in);

    }

        private static void mainInventory() {
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
            inventory[14] = new Book(15, "01111", "The Bitcoin Standardo", false, "");
            inventory[15] = new Book(16, "10000", "The Creature from Jekyll Island", false, "");
            inventory[16] = new Book(17, "10001", "The Object Stares Back", false, "");
            inventory[17] = new Book(18, "10010", "The Price of Tomorrow", false, "");
            inventory[18] = new Book(19, "10011", "The Sovereign Individual", false, "");
            inventory[19] = new Book(20, "10100", "Tower of Basel", false, "");
        }















    }

